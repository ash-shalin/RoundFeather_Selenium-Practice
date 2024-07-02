package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void intial() {

		driver.get("https://10fastfingers.com/");
		//driver.manage().deleteAllCookies();
	}

	@Test
	public void printScreen() throws IOException {
		TakesScreenshot screen =(TakesScreenshot)driver;
		File output= screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(output, new File("C:\\Users\\194880\\output.png"));

	}
	@AfterMethod
	public void exit() {
		driver.quit();
	}
}
