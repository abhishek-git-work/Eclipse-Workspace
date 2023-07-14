package Dropdown_Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest_options {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='eIPGRd']//div[@class='pcTkSc']//div[@class='wM6W7d']//span"));
		
		System.out.println(options.size());
		
		System.out.println(options.get(3).getText());  //fetch text of 4th number option

//***********************classic for loop*********************************************
		
//		for (int i=0; i<=options.size()-1; i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
//		
//		driver.findElement(By.xpath("//b[text()=' webdriver download']")).click();
				
//***********************enhanced for loop********************************************
		
//		for (WebElement option:options)
//		{
//			if (option.getText().contains("webdriver download"))
//			{
//				option.click();
//				break;
//			}			
//		}
		
		
		
	}

}
