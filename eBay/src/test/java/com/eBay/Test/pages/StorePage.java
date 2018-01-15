package com.eBay.Test.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.eBay.Utilities.ItemData;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StorePage extends PageObject{
	
	@FindBy(css="#sch-box > input")
	protected WebElementFacade storeSrchBox;
	
	@FindBy(css="#result-set > .item-cell")
	protected List<WebElementFacade> resultItems;
	
	public StorePage searchFor(String srchKey) {
		storeSrchBox.clear();
		storeSrchBox.type(srchKey + Keys.ENTER);
		return this;
	}
	
	public static Map<ItemData, String> itemData = new HashMap<>();;
	
	public void clickResultItemAtIndex(int index){
		if(resultItems.size() > 0) {
			if(index > resultItems.size()-1)
				Assert.fail("Index value: "+index+ " is greater than total items available.");
			else{
				itemData.put(ItemData.TITLE, resultItems.get(index).findElement(By.xpath(".//div[@class='desc']/a")).getText());
				itemData.put(ItemData.PRICE, resultItems.get(index).findElement(By.xpath(".//div[@class='price']/span[@class='curr']")).getText());
				resultItems.get(index).click();
			}
		}
		else {
			Assert.fail("No result items are available");
		}
	}
	
}
