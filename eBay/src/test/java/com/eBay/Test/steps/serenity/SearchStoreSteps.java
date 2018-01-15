package com.eBay.Test.steps.serenity;

import java.util.Map;

import com.eBay.Pages.Validators.StorePageValidator;
import com.eBay.Pages.Validators.ViewItemPageValidator;
import com.eBay.Test.pages.HomePage;
import com.eBay.Test.pages.RPP_Page;
import com.eBay.Test.pages.StorePage;
import com.eBay.Utilities.ItemData;

import net.thucydides.core.annotations.Step;

public class SearchStoreSteps {

	HomePage home;
	RPP_Page rpp;
	StorePage store;
	StorePageValidator storeValidate;
	ViewItemPageValidator viValidate;
	
	@Step
	public void go_to_Fashion_Shoes() {
		home.clickShoesInFashionMenu();
	}
	
	@Step
	public void go_to_DCShoes_Store(String store) {
		rpp.clickStoreNameLink(store);
	}
	
	@Step
	public void enter_srchKey_and_submit(String srchKey) {
		store.searchFor(srchKey);
	}

	@Step
	public void verify_search_has_results() {
		storeValidate.checkSearchHasResults();
	}
	
	@Step
	public void click_First_Result_Item() {
		store.clickResultItemAtIndex(0);
	}
	
	@Step
	public void check_item_title_and_price_details(Map<ItemData, String> data) {
		viValidate.validateItemDetails(data);
	}
	
}
