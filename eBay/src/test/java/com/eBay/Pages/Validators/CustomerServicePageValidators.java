package com.eBay.Pages.Validators;

import org.junit.Assert;

import com.eBay.Test.pages.CustomerServicePage;

public class CustomerServicePageValidators extends CustomerServicePage{
	
	public void validatePageTitle() {
		Assert.assertTrue("Incorrect Page title for Customer Serive Page", pageTitle.getText().equals("Customer Service"));
	}
	
}
