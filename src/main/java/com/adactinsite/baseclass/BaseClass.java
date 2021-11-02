package com.adactinsite.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

				 driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");

				driver = new InternetExplorerDriver();

			}

			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
		

	}

	public static void getURL(String Url) {

		driver.get(Url);
	}

	public static void clickOnElement(WebElement e) {

		try {
			e.click();
		} catch (Exception a) {
			a.printStackTrace();
		}

	}

	public static void inputValueElement(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void sleep(int milliseconds) throws InterruptedException {

		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollUpandDown(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void clear(WebElement element) {

		element.clear();
		
	}

	public static void actionsClass(String actionName, WebElement element) {

		try {
			Actions a = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			} else if (actionName.equalsIgnoreCase("doubleClick")) {
				a.contextClick(element).build().perform();
			} else if (actionName.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void implicitWait(int seconds, TimeUnit format) {

		driver.manage().timeouts().implicitlyWait(seconds, format);

	}

	public static void explicitWait(int seconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void fluent_Wait(int timeoutseconds, int pollingseconds, TimeUnit format) {

		Wait wait = new FluentWait(driver).withTimeout(30, format).pollingEvery(5, format).ignoring(Exception.class);

	}

	public static void frameOperations(String frameType, String id, String index, WebElement element) {

		try {
			if (frameType.equalsIgnoreCase("framebyId")) {
				driver.switchTo().frame(id);
			} else if (frameType.equalsIgnoreCase("frameByIndex")) {
				int value = Integer.parseInt(index);
				driver.switchTo().frame(value);
			} else if (frameType.equalsIgnoreCase("frameByElement")) {
				driver.switchTo().frame(element);
			} else if (frameType.equalsIgnoreCase("parentFrame")) {
				driver.switchTo().parentFrame();
			} else if (frameType.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropdownSelect(WebElement element, String type, String value) {

		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropdownDeselect(WebElement element, String type, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.deselectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibileText")) {
			s.deselectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.deselectByIndex(index);
		}

	}

	public static void dropdownOptions(String type, WebElement element) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("getOptions")) {
			s.getOptions();
		} else if (type.equalsIgnoreCase("getFirstSelectedOption")) {
			s.getFirstSelectedOption();
		} else if (type.equalsIgnoreCase("allSelectedOptions")) {
			s.getAllSelectedOptions();
		} else if (type.equalsIgnoreCase("isMultiple")) {
			s.isMultiple();
		}
	}

	public static void takeScreenshot(String path) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

	public static void endSession(String type) {

		if (type.equalsIgnoreCase("close")) {
			driver.close();
		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		}
	}

	public static void navigate(String type, String value) {

		if (type.equalsIgnoreCase("to")) {

			driver.navigate().to(value);
		} else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void getDriverMethods(String type) {

		if (type.equalsIgnoreCase("currentUrl")) {
			driver.getCurrentUrl();
		} else if (type.equalsIgnoreCase("title")) {
			driver.getTitle();
		}
	}

	public static void elementMethods(String type, WebElement element, String value) {

		if (type.equalsIgnoreCase("getText")) {
			element.getText();
		} else if (type.equalsIgnoreCase("getAttribute")) {
			element.getAttribute(value);
		}
	}

	public static void simpleAlert() {

		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlert(String type) {

		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
	}

	public static void promptAlert(String type, String value) {

		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		} else if (type.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(value);
		}
	}

	public static void robotClass(String type) throws AWTException {

		Robot r = new Robot();
		if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		} else if (type.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		} else if (type.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	public static void check_Box(String type, WebElement element) {

		if (type.equalsIgnoreCase("isEnabled")) {
			element.isEnabled();
		} else if (type.equalsIgnoreCase("isDisplayed")) {
			element.isDisplayed();
		} else if (type.equalsIgnoreCase("isSelected")) {
			element.isSelected();
		}
	}

	public static void getWindow(String type, String destination) {

		if (type.equalsIgnoreCase("getWindowHandle")) {
			String id = driver.getWindowHandle();
			System.out.println(id);
		} else if (type.equalsIgnoreCase("getWindowHandles")) {
			Set<String> all_Ids = driver.getWindowHandles();
			for (String id : all_Ids) {
				System.out.println(id);
				String title = driver.switchTo().window(id).getTitle();
				System.out.println("title");
			}

			String actualTitle = destination;
			for (String id : all_Ids) {
				if (driver.switchTo().window(id).getTitle().equalsIgnoreCase(destination)) {
					break;
				}

			}

		}

	}

}
