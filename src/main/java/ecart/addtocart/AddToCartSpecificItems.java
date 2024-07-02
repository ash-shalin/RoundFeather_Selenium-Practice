package ecart.addtocart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartSpecificItems {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		List<WebElement> productname = driver.findElements(By.xpath("//*[@class='product-name']"));

		for (int i = 0; i < productname.size(); i++) {

			String CurrentProduct = productname.get(i).getText();

			if (CurrentProduct.contains("Beans")) {

				driver.findElements(By.xpath("//*[text()=\"ADD TO CART\"]")).get(i).click();				break;
			}

		}

	}
}
