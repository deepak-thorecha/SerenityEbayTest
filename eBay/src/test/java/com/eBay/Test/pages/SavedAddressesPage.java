package com.eBay.Test.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SavedAddressesPage extends PageObject{
	
	@FindBy(xpath="//div[contains(@id, 'addressunitprimary')]/div[@class='addresswidth']")
	protected WebElementFacade addressContainer;
	
	@FindBy(xpath="//div[contains(@id, 'addressunitprimary')]/div[@class='addresswidth']/span")
	protected List<WebElementFacade> addressLines;
	
	
}
