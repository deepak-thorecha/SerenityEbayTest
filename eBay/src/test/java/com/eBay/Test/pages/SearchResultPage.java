package com.eBay.Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject{
	
	@FindBy(id="ResultSetItems")
	protected WebElementFacade srchResultsContainer;
	
	@FindBy(css="#ListViewInner > li")
	protected WebElementFacade resultItemTile;
	
	@FindBy(css=".sort-menu-container > a[aria-controls='SortMenu']")
	protected WebElementFacade sortButton;
	
	@FindBy(id="RelatedSearchesContainer")
	protected WebElementFacade relatedSrchContainer;
	
	
}
