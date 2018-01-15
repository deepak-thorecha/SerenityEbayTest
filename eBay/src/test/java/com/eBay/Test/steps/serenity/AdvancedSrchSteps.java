package com.eBay.Test.steps.serenity;

import com.eBay.DataClasses.SearchFilter;
import com.eBay.Pages.Validators.SearchResultPageValidators;
import com.eBay.Test.pages.AdvancedSearchPage;
import com.eBay.Test.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class AdvancedSrchSteps {
	
	HomePage home;
	AdvancedSearchPage advPage;
	SearchResultPageValidators srpValidate;
	
	@Step
	public void click_advanced_link_on_homepage() {
		home.clickAdvancedLink();
	}
	
	@Step
	public void enter_searchKey_on_advancedSrch_page(SearchFilter srch) {
		advPage.enterSearchKeyWord(srch.srchKeyWord);
	}
	
	@Step
	public void add_price_filter_values(SearchFilter srch){
		advPage.applyPriceFilters(srch.minPrice, srch.maxPrice);
	}
	
	@Step
	public void apply_buying_format(SearchFilter srch) {
		advPage.selectBuyingFormat(srch.buyFormat);
	}
	
	@Step
	public void submit_search_with_filters() {
		advPage.submitSearch();
	}
	
	@Step
	public void verifyPageIsSearchResultsPage() {
		srpValidate.validateThisIsSRP();
	}
}
