package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactinsite.pom.BookAHotelPage;
import com.adactinsite.pom.BookingConfirmPage;
import com.adactinsite.pom.LogInPage;
import com.adactinsite.pom.SearchHotelPage;
import com.adactinsite.pom.SelectHotelPage;

public class PageObjectManager {

	public WebDriver driver; // null

	private LogInPage login; // empty

	private SearchHotelPage search;

	private SelectHotelPage select;

	private BookAHotelPage book;

	private BookingConfirmPage confirm;

	

	public PageObjectManager(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
			
	
	
	}

	public LogInPage getInstanceLogin() {

		 login = new LogInPage(driver); // object

		return login; 

	}

	public SearchHotelPage getInstanceSearch() {

		search = new SearchHotelPage(driver);

		return search;

	}

	public SelectHotelPage getInstanceSelect() {

		select = new SelectHotelPage(driver);

		return select;

	}

	public BookAHotelPage getInstanceBookHotel() {

		book = new BookAHotelPage(driver);

		return book;

	}

	public BookingConfirmPage getInstanceBooking() {

		confirm = new BookingConfirmPage(driver);

		return confirm;

	}

}
