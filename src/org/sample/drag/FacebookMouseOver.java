package org.sample.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookMouseOver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Drag&Drop Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement cross = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	cross.click();
	WebElement women = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
	Actions a = new Actions(driver);
	a.moveToElement(women).perform();
	WebElement wear = driver.findElement(By.xpath("(//a[@title='Footwear'])[1]"));
 wear.click();
}
}
