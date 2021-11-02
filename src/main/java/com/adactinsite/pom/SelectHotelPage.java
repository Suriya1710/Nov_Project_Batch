package com.adactinsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	@FindBy(id = "radiobutton_0")
	private WebElement clickradiobtn;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	private WebDriver driver;

	public SelectHotelPage(WebDriver Cdriver) {
		this.driver = Cdriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getClickradiobtn() {
		return clickradiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
