package com.testng.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertions {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
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
		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
		}
	}
	
	@Test
	public void titleAndLoginButtonDisplay() {
		By Login_btn= By.id("login-button");
		String actualTitle=driver.getTitle();
		String expectedTitle="Swa Labs";
		SoftAssert obj1= new SoftAssert();
		obj1.assertEquals(actualTitle, expectedTitle, "Title does not match");
		obj1.assertEquals(driver.findElement(Login_btn).isDisplayed(), true, "button not found");
		obj1.assertAll();//ipzhanu ella soft assertionum work akunnath 
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
