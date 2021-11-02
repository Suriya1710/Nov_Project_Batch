package com.adactinsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage {

	@FindBy(name = "ids[]")
	private WebElement click;
	private WebDriver driver;

	public BookedItineraryPage(WebDriver Fdriver) {
		this.driver = Fdriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id = "logout")
	private WebElement logout;

}
