package com.eBay.Test.pages;


import org.openqa.selenium.support.ui.Select;

import com.eBay.DataClasses.User;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UpdateAddressPage extends PageObject{
	
	@FindBy(name="address1")
	WebElementFacade addr1;
	
	@FindBy(name="address2")
	WebElementFacade addr2;
	
	@FindBy(name="city")
	WebElementFacade city;
	
	@FindBy(name="state")
	WebElementFacade state;
	
	@FindBy(name="zip")
	WebElementFacade postcode;
	
	@FindBy(name="phoneFlagComp1")
	WebElementFacade phoneNum;
	
	@FindBy(css="input[value='Continue']")
	WebElementFacade continueBtn;
	
	private UpdateAddressPage enterText(WebElementFacade element, String value) {
		element.type(value);
		return this;
	}
	
	private UpdateAddressPage addStateValue(String stateVal) {
		Select stateSelect = new Select(state);
		stateSelect.selectByValue(stateVal);
		return this;
	}
	
	public UpdateAddressPage addUserAddressDetails(User user) {
		this.enterText(addr1, user.userAddr1)
			.enterText(addr2, user.userAddr2)
			.enterText(city, user.userCity)
			.addStateValue(user.userState)
			.enterText(postcode, user.userPostCode)
			.enterText(phoneNum, user.userPhoneNum);
		return this;
	}
	
	public UpdateAddressPage clickContinue() {
		continueBtn.click();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
