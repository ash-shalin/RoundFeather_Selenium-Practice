package com.iframeshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIFramesHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		String st=("[+] [-] [*] [/] [`] ['] [\"] [^] [¨] [ç] [:] [;] [_]\n");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(st);   
	}

}
