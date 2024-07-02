package com.selenium.testmethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.objects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialMethods {
WebDriver driver;

@BeforeTest
public void beforetest() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	//opening new tab
	/*
	 * // driver.switchTo().newWindow(WindowType.TAB); //
	 * driver.get("https://www.google.com/");
	 */	
	
}

@Test
public void SearchOperations() {
	LoginPage page =new LoginPage(driver); 
	page.GoogleSearchPage("facebook");
}

@AfterTest
public void AfterTest() {
	driver.quit();
}

}
