package com.eBay.Test.steps.serenity;

import com.eBay.Test.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class GlobalSteps {

	HomePage home;
	
	@Step
    public void is_on_ebay_home_page() {
		home.open();
    }

}