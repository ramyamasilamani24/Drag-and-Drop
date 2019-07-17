package org.sample.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintMouseOver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Drag&Drop Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.sprint.com/");
	driver.manage().window().maximize();
	WebElement shop = driver.findElement(By.xpath("(//button[@class='unstyled-button sprint-menu__root js-nav-link-root'])[4]"));
	Actions a=new Actions(driver);
	a.moveToElement(shop).perform();
	WebElement cl = driver.findElement(By.xpath(""));
	cl.click();
}
}
//doubt