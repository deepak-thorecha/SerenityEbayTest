package com.eBay.Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CustomerServicePage extends PageObject{
	
	@FindBy(id="gh-title")
	protected WebElementFacade pageTitle;
	
}
