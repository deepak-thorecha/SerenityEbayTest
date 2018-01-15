package com.eBay.Pages.Validators;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.eBay.DataClasses.User;
import com.eBay.Test.pages.SavedAddressesPage;

import net.serenitybdd.core.pages.WebElementFacade;

public class SavedAddressesPageValidators extends SavedAddressesPage{
	
	public void validateAddressDetails(User user) {
		Assert.assertTrue("Updated Address details are not present.", addressContainer.isDisplayed());
		List<String> addressValues = new ArrayList<>();
		for (WebElementFacade addrLine : addressLines) {
			addressValues.add(addrLine.getText());
		}
		Assert.assertTrue("Name is incorrect...!", (addressValues.get(0).contains(user.firstName) && addressValues.get(0).contains(user.lastName)));
	}
	
}
