package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A {  // pom

	public WebDriver driver; // ----> null

	// WebElement refName = driver.findElement(By.locators("value"));
	
	// WebElement refName = driver.findElement(By.locators("value"));
	
	// WebElement refName = driver.findElement(By.locators("value"));

	@FindBy(id = "email")
	private WebElement email;

	public A(WebDriver driver2) {

		this.driver = driver2; // driver = chrome;
		
		PageFactory.initElements(driver, this);

	}

	public WebElement getEmail() {
		return email;
	}

}
