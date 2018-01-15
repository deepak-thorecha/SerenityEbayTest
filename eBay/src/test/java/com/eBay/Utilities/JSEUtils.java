package com.eBay.Utilities;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.pages.WebElementFacade;

public class JSEUtils {
	
	public static void clickElement(WebElementFacade element) {
		((JavascriptExecutor) MyDriver.getDriver()).executeScript("argument[0].click", element);
	}
}
