package com.eBay.Utilities;

import org.openqa.selenium.WebDriver;

public class MyDriver {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		MyDriver.driver = driver;
	}
	
}
