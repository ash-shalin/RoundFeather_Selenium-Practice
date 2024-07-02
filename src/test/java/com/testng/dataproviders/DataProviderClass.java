package com.testng.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "loginData")
	public Object[][] ValuesToTest() {
		Object[][] values = new Object[][] { 
			{
			"standard_user", "secret_sauce" }, { "Wrong_user", "secret_sauce" }

		};

		return values;

	}
}
