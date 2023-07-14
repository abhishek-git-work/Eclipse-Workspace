package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement x = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		x.click();
		
		boolean result = x.isSelected();
		
		System.out.println(result);
		
		
		
		

}
}