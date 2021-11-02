package com.sd;

import org.openqa.selenium.WebDriver;

import com.Cucumber_Demo.Test_Runner;
import com.adactinsite.baseclass.BaseClass;
import com.adactinsite.helper.File_Reader_Manager;
import com.adactinsite.helper.PageObjectManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Before
	public static void beforeHooks(Scenario s) {

		System.out.println("Before Hooks");

		String status = s.getStatus();

		System.out.println("Status : " + status);

	}

	@After
	public static void afterHook(Scenario s) throws Throwable {

		System.out.println("After Hooks");
		

		if (s.isFailed()) {

			takeScreenshot("");

		}

	}

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		System.out.println("A");
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();

		getURL(url);

	}

	@When("^user Enter The  Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {

		
		inputValueElement(pom.getInstanceLogin().getUsername(), "SuriyaVeeran17");

	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		inputValueElement(pom.getInstanceLogin().getPassword(), "Music1710");

	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLogin());

	}

	@When("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {

		dropdownSelect(pom.getInstanceSearch().getLocation(), "byValue", "Sydney");

	}

	@When("^User Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {

		dropdownSelect(pom.getInstanceSearch().getHotel(), "byValue", "Hotel Creek");

	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {

		dropdownSelect(pom.getInstanceSearch().getRoomtype(), "byValue", "Standard");

	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {

		dropdownSelect(pom.getInstanceSearch().getNumberofrooms(), "byValue", "2");

	}

	@When("^User Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {

		// clear(pom.getInstanceSearch().getCheckin());

		inputValueElement(pom.getInstanceSearch().getCheckin(), "15/04/2021");

	}

	@When("^User Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {

//		clear(pom.getInstanceSearch().getCheckout());

		inputValueElement(pom.getInstanceSearch().getCheckout(), "17/04/2021");

	}

	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {

		dropdownSelect(pom.getInstanceSearch().getAdultroom(), "byValue", "2");

	}

	@When("^User Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {

		dropdownSelect(pom.getInstanceSearch().getChildroom(), "byValue", "2");

	}

	@Then("^User Click The Search Button It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getSumbit());

	}

	@When("^User Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {

		clickOnElement(pom.getInstanceSelect().getClickradiobtn());

	}

	@Then("^User Click The Continue Button It Navigates To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSelect().getContinuebtn());

	}

	@When("^User Enter The Valid First Name$")
	public void user_Enter_The_Valid_First_Name() throws Throwable {

		inputValueElement(pom.getInstanceBookHotel().getFirstname(), "Suriya");

	}

	@When("^User Enter The Valid Last Name$")
	public void user_Enter_The_Valid_Last_Name() throws Throwable {

		inputValueElement(pom.getInstanceBookHotel().getLastname(), "Veeran");

	}

	@When("^User Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {

		inputValueElement(pom.getInstanceBookHotel().getAddress(), "No 221B BakerStreet,Gotham City,Washington Dc");

	}

	@When("^User Enter The Valid Credit Card Number$")
	public void user_Enter_The_Valid_Credit_Card_Number() throws Throwable {

		inputValueElement(pom.getInstanceBookHotel().getCardnum(), "12345678900987654");

	}

	@When("^User Choose The Credit Card Type$")
	public void user_Choose_The_Credit_Card_Type() throws Throwable {

		dropdownSelect(pom.getInstanceBookHotel().getCardtype(), "byValue", "VISA");

	}

	@When("^User Select The Select Month In The Expiry Date Box$")
	public void user_Select_The_Select_Month_In_The_Expiry_Date_Box() throws Throwable {

		dropdownSelect(pom.getInstanceBookHotel().getCardExpMonth(), "byVisibleText", "October");

	}

	@When("^User Select The Select Year In The Expiry Date Box$")
	public void user_Select_The_Select_Year_In_The_Expiry_Date_Box() throws Throwable {

		dropdownSelect(pom.getInstanceBookHotel().getCardExpYear(), "byValue", "2022");

	}

	@When("^User Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {

		inputValueElement(pom.getInstanceBookHotel().getCcvno(), "1234");

	}

	@Then("^User Click The Book Now Button It Navigates To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {

		clickOnElement(pom.getInstanceBookHotel().getBooknow());

	}

}
