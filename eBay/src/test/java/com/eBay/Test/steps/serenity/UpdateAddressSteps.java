package com.eBay.Test.steps.serenity;

import org.junit.Assert;

import com.eBay.DataClasses.User;
import com.eBay.Pages.Validators.CustomerServicePageValidators;
import com.eBay.Pages.Validators.SavedAddressesPageValidators;
import com.eBay.Test.pages.AccountSettingsPage;
import com.eBay.Test.pages.HomePage;
import com.eBay.Test.pages.SignInPage;
import com.eBay.Test.pages.UpdateAddressPage;
import com.eBay.Utilities.MyDriver;

import net.thucydides.core.annotations.Step;

public class UpdateAddressSteps {
	
	HomePage home;
	AccountSettingsPage acctPage;
	UpdateAddressPage addrPage;
	SignInPage loginPage;
	SavedAddressesPageValidators addrValidate;
	CustomerServicePageValidators csValidate;
	
	@Step
	public void go_to_Account_Settings() {
		home.clickAccountSettingsLinkInUserDropdown();
	}
	
	@Step
	public void click_addresses_link() {
		acctPage.clickAddressesLink();
	}
	
	@Step
	public void click_create_link() {
		acctPage.clickCreateLink();
	}
	
	@Step
	public void click_change_link() {
		acctPage.clickChangeLink();
	}
	
	@Step
	public void perform_intermediate_confirmation_login(User user) {
		try{
			loginPage.enterPassword(user).clickSignInBtn();
		}catch(Exception e) {}
	}
	
	@Step
	public void complete_address_details_form(User user) {
		addrPage.addUserAddressDetails(user)
			.clickContinue();
	}
	
	@Step
	public void verify_saved_address(User user) {
		addrValidate.validateAddressDetails(user);
	}
	
	@Step
	public void verify_customer_service_link() {
		addrPage.clickCustomerService();
	}
	
	@Step
	public void validate_customer_service_page_opened() {
		Assert.assertTrue("No new window is opened. Customer Service page should have opened in new window.", UpdateAddressPage.winHandles.size() > 1);
		
		UpdateAddressPage.winHandles.remove(UpdateAddressPage.currentWindow);
		MyDriver.getDriver().switchTo().window(UpdateAddressPage.winHandles.iterator().next());
		
		csValidate.validatePageTitle();
	}
	
}
