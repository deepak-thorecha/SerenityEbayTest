package com.eBay.Pages.Validators;

import org.junit.Assert;

import com.eBay.Test.pages.SearchResultPage;
import com.eBay.Utilities.MyDriver;

public class SearchResultPageValidators extends SearchResultPage{
	
	public void validateThisIsSRP() {
		Assert.assertTrue("Current Page does not appear to be SRP", MyDriver.getDriver().getCurrentUrl().contains("sch"));
		Assert.assertTrue("Current Page does not appear to be SRP", sortButton.waitUntilVisible().isCurrentlyVisible());
	}
	
}
