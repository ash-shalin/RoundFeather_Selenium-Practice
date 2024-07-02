package ecart.addtocart.multipleitems;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMultipleItems {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		String[] Products = { "Brocolli", "Beans", "Carrot", "Cucumber" };
		// converting string[] to array list productList
		List<String> productList = Arrays.asList(Products);

		// all the items with the xpath is stored to list productname
		Thread.sleep(3000);
		List<WebElement> productname = driver.findElements(By.xpath("//*[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < productname.size(); i++) {
			// debug the code to understand the spliting and trim
			String[] CurrentProduct = productname.get(i).getText().split("-");
			String actualName = CurrentProduct[0].trim();
			// from "Brocolli -1kg" to "Brocolli"

			if (productList.contains(actualName)) {
				j++;

				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
				// j is used for exiting the for loop if the iteration of elements are over ;
				if (j == productList.size())
					break;
			}

		}

	}
}
