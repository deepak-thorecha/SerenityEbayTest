package com.eBay.Test.pages;

import org.openqa.selenium.interactions.Actions;

import com.eBay.Utilities.MyDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ebay.com.au/")
public class HomePage extends PageObject{
	
	@FindBy(css="#gh-ug-flex > a")
	WebElementFacade regButton;
	
	@FindBy(css="#s0-container > li.hl-cat-nav__js-tab > a[href*=fashion-home]")
	WebElementFacade fashionMenuLink;
	
	@FindBy(css=".hl-cat-nav__sub-cat-col a[href*='/rpp/shoes']")
	WebElementFacade shoesSubMenuLink;
	
	@FindBy(id="gh-ug")
	WebElementFacade userDropBtn;
	
	@FindBy(xpath=".//li[@id='gh-uac']/a")
	WebElementFacade acctSettingsLink;
	
	@FindBy(id="gh-as-a")
	WebElementFacade advancedSrchLink;
	
	public RegistrationPage clickRegisterBtn() {
		regButton.click();
		return new RegistrationPage();
	}
	
	public RPP_Page clickShoesInFashionMenu() {
		Actions actions = new Actions(MyDriver.getDriver());
		actions.moveToElement(fashionMenuLink)
			.click(shoesSubMenuLink).build().perform();
		return new RPP_Page();
	}
	
	public AccountSettingsPage clickAccountSettingsLinkInUserDropdown() {
		boolean flag = false;
		while(!flag) {
			userDropBtn.click();
			if(acctSettingsLink.isPresent() && acctSettingsLink.isDisplayed()) {
				flag = true;
				acctSettingsLink.click();
			}
		}
		return new AccountSettingsPage();
	}
	
	public AdvancedSearchPage clickAdvancedLink() {
		advancedSrchLink.click();
		return new AdvancedSearchPage();
	}
	
}
