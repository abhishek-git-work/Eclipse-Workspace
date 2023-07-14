//types of locators = x-path(relative and absolute, css, tagname, ID, name, classname, link text, partial link text
//tagname = we can use tagname only when multiple tagname are present in code. we never use duplicate tagname. we can not use index in it.
//ID = ID should be present in attribute and ID should be unique. 
//name = name should be present in attribute and name should be unique.
//classname = classname should be present in attribute and classname should be unique.

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abhishek");   //relative x-path
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abhishek");  //absolute x-path 
//		driver.findElement(By.tagName("button")).click();
//		driver.findElement(By.id("email")).sendKeys("abhishek");
//		driver.findElement(By.name("email")).sendKeys("abhishek");
//		driver.findElement(By.className("_9npi")).sendKeys("abhi12345");  //type partial value of attribute class. if class value is common, use uncommon value of that class
//		driver.findElement(By.linkText("Watch")).click();
//		driver.findElement(By.partialLinkText("uploading")).click();
     
		
		
		
	}

}
