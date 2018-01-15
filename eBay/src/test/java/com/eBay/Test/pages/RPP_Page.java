package com.eBay.Test.pages;

import net.serenitybdd.core.pages.PageObject;

public class RPP_Page extends PageObject{
	
	public StorePage clickStoreNameLink(String storeName) {
		/*driver.findElement(By.xpath("//section[contains(@class, 'b-list')]//a[text()='"+storeName+"']")).click();*/
		$("//section[contains(@class, 'b-list')]//a[text()='"+storeName+"']").click();
		return new StorePage();
	}
	
}
