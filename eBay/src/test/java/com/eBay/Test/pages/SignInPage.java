package com.eBay.Test.pages;

import com.eBay.DataClasses.User;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInPage extends PageObject{
	
	@FindBy(name="pass")
	WebElementFacade passwordFld;
	
	@FindBy(name="sgnBt")
	WebElementFacade signInBtn;
	
	public SignInPage enterPassword(User user) {
		passwordFld.type(user.userPassword);
		return this;
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}
	
}
