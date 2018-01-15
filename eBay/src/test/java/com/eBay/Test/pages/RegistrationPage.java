package com.eBay.Test.pages;

import com.eBay.DataClasses.User;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationPage extends PageObject{
	
	@FindBy(name="firstname")
	WebElementFacade firstName;
	
	@FindBy(name="lastname")
	WebElementFacade lastName;
	
	@FindBy(name="email")
	WebElementFacade email;
	
	@FindBy(name="PASSWORD")
	WebElementFacade password;
	
	@FindBy(id="ppaFormSbtBtn")
	WebElementFacade registerBtn;
	
	public RegistrationPage enterText(WebElementFacade element, String value) {
		element.type(value);
		return this;
	}
	
	public static String userEmail = new String(); 
	public RegistrationPage fillRegistrationForm(User user) {
		String stamp = System.currentTimeMillis()+"";
		this.enterText(firstName, user.firstName + stamp)
			.enterText(lastName, user.lastName + stamp)
			.enterText(email, user.userEmail + stamp + "@email.com")
			.enterText(password, user.userPassword);
		
		userEmail = user.userEmail + stamp + "@email.com";
		
		return this;
	}
	
	public void clickRegister() {
		registerBtn.click();
	}
	
}
