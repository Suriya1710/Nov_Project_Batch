package com.adactinsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {

	private WebDriver driver;

	@FindBy(id = "logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	public BookingConfirmPage(WebDriver Edriver) {

		this.driver = Edriver;
		PageFactory.initElements(driver, this);

	}

}
