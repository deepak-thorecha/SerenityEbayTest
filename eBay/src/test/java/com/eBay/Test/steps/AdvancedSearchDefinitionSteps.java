package com.eBay.Test.steps;

import com.eBay.DataClasses.AdvancedSearchData;
import com.eBay.Test.steps.serenity.AdvancedSrchSteps;
import com.eBay.Utilities.ExcelToClassObject;
import com.eBay.Utilities.ResourceFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AdvancedSearchDefinitionSteps {
	
	static int count = 0;
	static AdvancedSearchData data;
	static {
		data = (AdvancedSearchData) ExcelToClassObject.createMappingPOJO(AdvancedSearchData.class, ResourceFiles.TESTDATA_XLS);
	}
	
	@Steps
	AdvancedSrchSteps advanced;
	
	@When("^the user performs advanced search for (\\d+) time$")
	public void the_user_performs_advanced_search_for_time(int times) throws Exception {
		count = times-1;
		advanced.click_advanced_link_on_homepage();
		advanced.enter_searchKey_on_advancedSrch_page(data.srchData.get(times-1));
	}


	@When("^specify price and buyFormat$")
	public void specify_price_and_buyFormat() throws Exception {
		advanced.add_price_filter_values(data.srchData.get(count));
		advanced.apply_buying_format(data.srchData.get(count));
		advanced.submit_search_with_filters();
	}

	@Then("^I validate the result items have filter applied$")
	public void i_validate_the_result_items_have_filter_applied() throws Exception {
		advanced.verifyPageIsSearchResultsPage();
	}
	
}
