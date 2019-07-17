package org.sample.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://toolsqa.com/automation-practice-table/\r\n");
		
		 List<WebElement> tRow = driver.findElements(By.tagName("th")); 
		 for (int i=0;i<tRow.size();i++) { 
			 WebElement row = tRow.get(i); 
		 String text =row.getText();
		 System.out.println(text);
		 }
		 
	//to print only the datas
	List<WebElement> tRow1 = driver.findElements(By.tagName("tr"));
	int s=tRow1.size();
	System.out.println(s);
	for (int i1 = 0; i1 <tRow1.size(); i1++) {
		WebElement row = tRow1.get(i1);
	//for (WebElement y : tRow1) {
		
	}
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		for (int j = 0; j < tData.size(); j++) {
			WebElement data = tData.get(j);
			String text = data.getText();
		//for (WebElement z: tData) {
			
		
			//String name = z.getText();
			if(text.equals("4")) {
			System.out.println(text);
			System.out.println("row no "+i1);
			System.out.println("cell no "+j);
			
		}
		
	}
	
	
}
}
//}

