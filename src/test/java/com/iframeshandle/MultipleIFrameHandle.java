package com.iframeshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class MultipleIFrameHandle {
public void test() throws InterruptedException {
	// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.findElement(By.xpath("(//a[normalize-space()='Iframe with in an Iframe'])[1]")).click();
			
			/*
			 * WebElement frame1 = driver.findElement(By.id("singleframe")); WebElement
			 * frame2 = driver.findElement(By.id("singleframe"));
			 */
			
			//switch to iframe 1 
			driver.switchTo().frame(0);
			//switch to iframe 2
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			String actualTitle= "iFrame Demo";
			Assert.assertTrue(actualTitle.contains("iFrame"), "title does not match");
			//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ashik shalin");
			driver.quit();
	
}
	
		
	

}
