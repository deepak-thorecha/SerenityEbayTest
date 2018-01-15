package com.eBay.Test.steps;

import com.eBay.DataClasses.RegistrationUserData;
import com.eBay.Test.steps.serenity.RegisterSteps;
import com.eBay.Test.steps.serenity.UpdateAddressSteps;
import com.eBay.Utilities.ExcelToClassObject;
import com.eBay.Utilities.ResourceFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterUserDefinitionSteps {
	
	static int count = 0;
	static RegistrationUserData data;
	static {
		data = (RegistrationUserData) ExcelToClassObject.createMappingPOJO(RegistrationUserData.class, ResourceFiles.TESTDATA_XLS);
	}
	
	@Steps
	RegisterSteps regSteps;
	
	@Steps
	UpdateAddressSteps addrSteps;
	
	@When("^the user registers a new account for (\\d+) time$")
	public void the_user_registers_a_new_account_for_time(int regCount) throws Exception {
		count = regCount-1;
		regSteps.click_on_register_button();
		regSteps.complete_registration_form(data.users.get(regCount-1));
		regSteps.submit_registration_info();
	}


	@When("^adds a new Address$")
	public void adds_a_new_Address() throws Exception {
		addrSteps.go_to_Account_Settings();
		addrSteps.click_addresses_link();
		addrSteps.click_create_link();
		addrSteps.perform_intermediate_confirmation_login(data.users.get(count));
		addrSteps.complete_address_details_form(data.users.get(count));
	}

	@Then("^I validate the added address$")
	public void i_validate_the_added_address() throws Exception {
		try{
			addrSteps.verify_customer_service_link();
			addrSteps.validate_customer_service_page_opened();
		}catch(Exception e) {
			addrSteps.go_to_Account_Settings();
			addrSteps.click_change_link();
			addrSteps.verify_saved_address(data.users.get(count));
		}
	}
	
	
}
