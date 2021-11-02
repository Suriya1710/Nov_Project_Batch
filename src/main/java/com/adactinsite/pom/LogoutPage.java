package com.adactinsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	private WebDriver driver;

	public LogoutPage(WebDriver idriver) {

	this.driver=idriver;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
}
