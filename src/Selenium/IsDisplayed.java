package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.facebook.com/signup");
		
//		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
			
		WebElement x = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		
		boolean result = x.isDisplayed();
		
		System.out.println(result);

}
}