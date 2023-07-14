package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  
	
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Enter email or mobile number'])"));
		
//		driver.findElement(By.xpath("(//input[@placeholder='Enter email or mobile number'])")).sendKeys("12345");
		
		WebElement x = driver.findElement(By.xpath("(//button[@class='capText font16'])"));
		
		boolean result = x.isEnabled();
		
		System.out.println(result);

}
}