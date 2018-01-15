package com.eBay.Test.steps.serenity;

import com.eBay.DataClasses.User;
import com.eBay.Pages.Validators.SavedAddressesPageValidators;
import com.eBay.Test.pages.AccountSettingsPage;
import com.eBay.Test.pages.HomePage;
import com.eBay.Test.pages.SignInPage;
import com.eBay.Test.pages.UpdateAddressPage;

import net.thucydides.core.annotations.Step;

public class UpdateAddressSteps {
	
	HomePage home;
	AccountSettingsPage acctPage;
	UpdateAddressPage addrPage;
	SignInPage loginPage;
	SavedAddressesPageValidators addrValidate;
	
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
	
}
