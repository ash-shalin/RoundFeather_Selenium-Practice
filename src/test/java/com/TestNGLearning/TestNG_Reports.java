package com.TestNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Reports {
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
		String expectedTitle="Swag Labs";
		//Assert.assertEquals(actualTitle, expectedTitle, "title does not match:");
		System.out.println(actualTitle);
		Assert.assertTrue(actualTitle.contains(expectedTitle), "title does not match");
		
		Assert.assertEquals(driver.findElement(Login_btn).isDisplayed(), true, "button not found");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
