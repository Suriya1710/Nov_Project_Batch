package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;

import com.adactinsite.baseclass.BaseClass;

public class B extends BaseClass {  // step definition

	public static WebDriver driver; // ---> null

	public static void main(String[] args) {

		driver = BaseClass.getDriver("chrome"); // ---> chrome

		getURL("");

		A a = new A(driver);

		inputValueElement(a.getEmail(), "");

	}

}
