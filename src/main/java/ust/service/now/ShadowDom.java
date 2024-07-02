package ust.service.now;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ShadowDom {
	public void process() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ustglobaltest.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("QA.User");
		driver.findElement(By.id("user_password")).sendKeys("Ustqa@321");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement All = (WebElement) jse.executeScript(
				"return document.querySelector('body :first-child').shadowRoot.querySelector('div sn-polaris-layout').shadowRoot.querySelector('div.layout-main sn-polaris-header').shadowRoot.querySelector('nav div.polaris-header div.starting-header-zone div.polaris-header-menu [aria-label=\\\"All\\\"]')");
		Thread.sleep(3000);
		All.click();

		Thread.sleep(8000);
		WebElement newAll = driver.findElement(By.cssSelector("body :first-child")).getShadowRoot()
				.findElement(By.cssSelector("div sn-polaris-layout")).getShadowRoot()
				.findElement(By.cssSelector("div.layout-main sn-polaris-header")).getShadowRoot()
				.findElement(By.cssSelector(
						"nav div.polaris-header div.starting-header-zone div.polaris-header-menu [aria-label='All']"));
		Thread.sleep(6000);
		newAll.click();

		driver.quit();
	}

}
