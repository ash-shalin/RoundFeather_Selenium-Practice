package rahulShetty;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SortingTablesUsingStream {
	public void table() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//tr/th)[1]"));
	List<WebElement> original=driver.findElements(By.xpath("(//tr/th)[1]"));
	List <String> originalList= original.stream().map(s ->s.getText()).collect(Collectors.toList());
	List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(originalList.equals(sortedList));
	
	
	}
}
