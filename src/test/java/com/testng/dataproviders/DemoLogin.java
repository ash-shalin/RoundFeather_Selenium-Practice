package com.testng.dataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Ignoring this class
public class DemoLogin {
	public static final boolean DISABLED = true;
	//disabling the whole class
	By username = By.id("user-name");
	By password = By.id("password");

	WebDriver driver;

	@Test(dataProvider = "logindata1",dataProviderClass = com.testng.dataproviders.DemoData.class)
	public void logintest(String login, String passwordData) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.addArguments("--disable-extensions");
			chromeoptions.addArguments("--headless");
			//chromeoptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeoptions);
			driver.get("https://www.saucedemo.com");
			// driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			
			
			driver.findElement(username).sendKeys(login);
			driver.findElement(password).sendKeys(passwordData);
			Thread.sleep(2000);
			driver.close();

		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
		}

	}
}
