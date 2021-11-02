package com.adactinsite.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {

	private WebDriver driver;

	public BookAHotelPage(WebDriver Ddriver) {

		this.driver = Ddriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardnum;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(xpath = "(//select[@class='select_combobox2'])[1]")
	private WebElement cardExpMonth;

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement cardExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement ccvno;

	@FindBy(id = "book_now")
	private WebElement booknow;

}
