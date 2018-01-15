package com.eBay.Test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.eBay.Utilities.JSEUtils;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdvancedSearchPage extends PageObject{
	
	@FindBy(name="_nkw")
	WebElementFacade srchInputFld;
	
	@FindBy(name="_mPrRngCbx")
	WebElementFacade priceEnableCheckBox;
	
	@FindBy(name="_udlo")
	WebElementFacade minPrice;
	
	@FindBy(name="_udhi")
	WebElementFacade maxPrice;
	
	@FindBy(name="LH_Auction")
	WebElementFacade auctionCheckBox;
	
	@FindBy(name="LH_BIN")
	WebElementFacade binCheckBox;
	
	@FindBy(name="LH_CAds")
	WebElementFacade cAdCheckBox;
	
	@FindBy(css=".bottom-action-bar > a")
	WebElementFacade clearOptions;
	
	@FindBy(id="searchBtnLowerLnk")
	WebElementFacade submitSrch;
	
	public AdvancedSearchPage enterSearchKeyWord(String key) {
		srchInputFld.type(key);
		return this;
	}
	
	public AdvancedSearchPage applyPriceFilters(String min, String max) {
		priceEnableCheckBox.click();
		minPrice.type(min);
		maxPrice.type(max);
		return this;
	}
	
	/**
	 * @param format - For Invalid input, it default selects BUY IT NOW
	 */
	public AdvancedSearchPage selectBuyingFormat(String format) {
		WebElementFacade element = binCheckBox;
		switch (format) {
		case "AUCTION":
			element = auctionCheckBox;
			break;

		case "BUYITNOW":
			element = binCheckBox;
			break;

		case "CLASSIFIEDADS":
			element = cAdCheckBox;
			break;
		default: element = binCheckBox;
		break;
		}
		try {
			new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath("//legend[text()='Condition']"))).perform();
			element.waitUntilClickable().click();
		}catch (Exception e) {
			JSEUtils.clickElement(element);
		}
		return this;
	}
	
	public void submitSearch() {
		try{
			new Actions(getDriver()).moveToElement(submitSrch).perform();
			submitSrch.waitUntilClickable().click();
		}catch (Exception e) {
			JSEUtils.clickElement(submitSrch);
		}
	}
	
}
