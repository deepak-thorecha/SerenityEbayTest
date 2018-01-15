package com.eBay.Test.steps;

import com.eBay.Test.pages.StorePage;
import com.eBay.Test.steps.serenity.SearchStoreSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchStoreDefinitionSteps {

    @Steps
    SearchStoreSteps storeSrch;

    @When("^the user navigates to 'Fashion > Shoes > \"([^\"]*)\"'$")
    public void the_user_navigates_to_Fashion_Shoes_DC_Store(String storeName) throws Exception {
    		storeSrch.go_to_Fashion_Shoes();
    		storeSrch.go_to_DCShoes_Store(storeName);
    }

    @When("^searches for \"([^\"]*)\"$")
    public void searches_for(String srchKey) throws Exception {
    		storeSrch.enter_srchKey_and_submit(srchKey);
    }

    @Then("^they should see results with various items$")
    public void they_should_see_results_with_various_items() throws Exception {
    		storeSrch.verify_search_has_results();
    }

    @When("^the user click on one item$")
    public void the_user_click_on_one_item() throws Exception {
    		storeSrch.click_First_Result_Item();
    }

    @Then("^the user should see correct title and price details$")
    public void the_user_should_see_correct_title_and_price_details() throws Exception {
    		storeSrch.check_item_title_and_price_details(StorePage.itemData);
    }
    
    
}
