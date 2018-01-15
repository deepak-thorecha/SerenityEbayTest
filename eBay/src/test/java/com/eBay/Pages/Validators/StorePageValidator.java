package com.eBay.Pages.Validators;

import org.junit.Assert;

import com.eBay.Test.pages.StorePage;

public class StorePageValidator extends StorePage {
	
	public void checkSearchHasResults() {
		Assert.assertTrue("Search has yield no results...!", resultItems.size() > 0);
	}
	
}
