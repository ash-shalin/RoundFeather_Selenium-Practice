package com.selenium.browseractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
		//BrowserActions action= new BrowserActions();
		ChromeOptions options= new ChromeOptions();
		//options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		Thread.sleep(2000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * //go to link driver.get("https://www.google.com/"); //open new tab
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https://www.google.com/");
		 *  //open new window
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 * driver.get("https://www.google.com/");
		 */
		//open incognito tab
		//action.in
		//options.addArguments("--incognito");
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement e= driver.findElement(By.name("btnK"));
		e.click();
		Boolean b= e.isEnabled();
		System.out.println(b +"is visible");
		
		 
		
	}
}
