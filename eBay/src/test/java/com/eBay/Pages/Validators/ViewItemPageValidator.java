package com.eBay.Pages.Validators;

import java.util.Map;

import org.junit.Assert;

import com.eBay.Test.pages.ViewItemPage;
import com.eBay.Utilities.ItemData;


public class ViewItemPageValidator extends ViewItemPage{
	
	public void validateItemDetails(Map<ItemData, String> data) {
		Assert.assertTrue("Item Title is different.\nEXPECTED: "+data.get(ItemData.TITLE)+"\nACTUAL: "+itemTitle.getText()
				, itemTitle.getText().contains(data.get(ItemData.TITLE)));
		/*Assert.assertEquals("Item Title is different.\nEXPECTED: "+data.get(ItemData.TITLE)+"\nACTUAL: "+itemTitle.getText()
				, data.get(ItemData.TITLE), itemTitle.getText());*/
		Assert.assertEquals("Item Price is different.\nEXPECTED: "+data.get(ItemData.PRICE)+"\nACTUAL: "+itemPrice.getText()
				, data.get(ItemData.PRICE), itemPrice.getText());
	}
	
}
