package com.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetCodeFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-class\\Driver-FOX\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://letcode.in/frame");
		
		driver.switchTo().frame(1);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@name='fname']"));
		findElement.sendKeys("dhanu");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(frame2);
		
		WebElement findElement2 = driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
		
		findElement2.sendKeys("dhanushdev");
		
		driver.switchTo().parentFrame();
		
		WebElement findElement3 = driver.findElement(By.name("lname"));
		findElement3.sendKeys("dhanushphotography");
		
		driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement findElement4 = driver.findElement(By.className("title has-text-info"));
		String text = findElement4.getText();
		System.out.println(text);
		
	}

}
