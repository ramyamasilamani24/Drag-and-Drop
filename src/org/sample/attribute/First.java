package org.sample.attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Drag&Drop Selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		a.click();
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("ramya");
		
		
		  WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		  pass.sendKeys("ramya123");
		  String s1=pass.getAttribute("value");
		  System.out.println(s1);
		  String s2=name.getAttribute("value");
		  System.out.println(s2);
		
}
}
