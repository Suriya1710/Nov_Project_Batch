package com.Cucumber_Demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinsite.baseclass.BaseClass;
import com.adactinsite.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature",

		glue = "com.sd",
		
		monochrome = true, dryRun = false, strict = true,  
		
		tags = ("~@regressionTest"),
		
		plugin = {
				"html:Report/HTML_Report",
				
				"pretty" ,// ----> console
				
				"json:JsonReport/Report.json",

				
				"com.cucumber.listener.ExtentCucumberFormatter:ReportNew/ExtentReport.html"

		}

)
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {

		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();

		driver = BaseClass.getDriver(browser);

		
		
		
	}

	@AfterClass
	public static void tearDown() {

		driver.close();

	}

}
