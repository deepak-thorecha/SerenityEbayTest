package com.eBay.Test.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountSettingsPage extends PageObject{
	
	@FindBy(linkText="Addresses")
	WebElementFacade adressesLink;
	
	@FindBy(linkText="Create")
	List<WebElementFacade> createLink;
	
	@FindBy(linkText="Change")
	List<WebElementFacade> changeLink;
	
	public AccountSettingsPage clickAddressesLink() {
		adressesLink.waitUntilClickable().click();
		return this;
	}
	
	public void clickCreateLink() {
		createLink.get(0).click();
	}
	
	public void clickChangeLink() {
		changeLink.get(1).click();
	}
}
