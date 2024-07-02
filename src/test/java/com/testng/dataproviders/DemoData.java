package com.testng.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;

//ignoring this class
public class DemoData {
	
	
	//disabling the whole class
	@DataProvider(name = "logindata1")
	public Object[][] data1(){
	
		Object[][] newdata =new Object[][] {
			{"login1","password1"}, {"login2","password2"}, {"login3","password3"}
		};
		return newdata;
		
	}
}
