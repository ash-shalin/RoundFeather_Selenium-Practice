package com.selenium.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By SearchBox = By.xpath("//textarea[@name='q'");
	By Search_btn = By.xpath("(//input[@name='btnK'])[2]");

	public void GoogleSearchPage(String keywords) {
		try {
			driver.findElement(SearchBox).sendKeys(keywords);
			driver.findElement(Search_btn).click();
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}

	}

}
