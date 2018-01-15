package com.eBay.Test.steps.serenity;

import com.eBay.DataClasses.User;
import com.eBay.Test.pages.HomePage;
import com.eBay.Test.pages.RegistrationPage;

import net.thucydides.core.annotations.Step;

public class RegisterSteps {
	
	HomePage home;
	RegistrationPage reg;
	
	@Step
	public void click_on_register_button() {
		home.clickRegisterBtn();
	}
	
	@Step
	public void complete_registration_form(User user) {
		reg.fillRegistrationForm(user);
	}
	
	@Step
	public void submit_registration_info() {
		reg.clickRegister();
	}
	
	
}
