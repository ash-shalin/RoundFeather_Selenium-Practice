package rahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("li[class='ui-menu-item'] a")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("li[class='ui-menu-item'] a")).getText(),"British Indian Ocean Territory", "Text not found");
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("li[class='ui-menu-item'] a")).getAttribute("Class"));

		/*
		 * for (WebElement option : options) {
		 * 
		 * if (option.ge tText().equalsIgnoreCase("India")) {
		 * System.out.println(option.getText()); Thread.sleep(2000); option.click();
		 * //option.click(); break; }
		 * 
		 * // System.out.println(option.getText()); }
		 */
		driver.quit();

	}

}
