package com.selenium.browseractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class InteractionsOfWebElements {
	WebDriver driver = new ChromeDriver();

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	@Test
	public void test() {

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/link.html");
		Assert.assertEquals(driver.findElement(By.linkText("click here")).isDisplayed(), true, "button not found");
		Assert.assertEquals(driver.findElement(By.linkText("click here")).isEnabled(), true, "not found");
		String title = driver.getTitle();
		System.out.println(title);
		// driver.findElement(By.linkText("click here")).click();
		driver.findElement(By.partialLinkText("click")).click();
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);

	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	// }

}
