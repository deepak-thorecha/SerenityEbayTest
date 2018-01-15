package com.eBay.Test.steps;

import com.eBay.Test.steps.serenity.GlobalSteps;
import com.eBay.Utilities.MyDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;

public class CommonDefinitionSteps {
	
	@Managed
	WebDriverFacade driver;
	
	@Steps
    GlobalSteps global;
	
	@Before
	public void setUp() {
		driver.manage().window().maximize();
		MyDriver.setDriver(driver);
	}
	
	@Given("^the user is on the Ebay home page$")
    public void the_user_is_on_the_Ebay_home_page() throws Exception {
		global.is_on_ebay_home_page();
    }
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
