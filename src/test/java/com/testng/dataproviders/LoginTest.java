package com.testng.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	By username = By.id("user-name");
	By password = By.id("password");

	@Test(dataProvider = "loginData",dataProviderClass = com.testng.dataproviders.DataProviderClass.class)
	//dataprovider name+package+(DataProviderClass).class
	public void logintest(String login,String passwordData) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.addArguments("--disable-extensions");
			chromeoptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeoptions);
			driver.get("https://www.saucedemo.com");
			// driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(username).sendKeys(login);
			driver.findElement(password).sendKeys(passwordData);
			Thread.sleep(2000);
			driver.close();

		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
		}
	}

}