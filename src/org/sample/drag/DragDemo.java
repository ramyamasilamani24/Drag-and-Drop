package org.sample.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Drag&Drop Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement drag1 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
	WebElement drop = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(drag1, drop).perform();
}
}
