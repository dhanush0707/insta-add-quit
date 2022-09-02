package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PresentFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-class\\Driver-EDGE\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//switch to frame by index
		//driver.switchTo().frame(0);
		
		//switch to frame by id (or) name
		//driver.switchTo().frame("login_page");
		
		// switch to frames by webelement reference
		WebElement findElement2 = driver.findElement(By.xpath("//frame[@name='login_page']"));		
		driver.switchTo().frame(findElement2);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		findElement.sendKeys("dhanush");
		
		
	}

}
