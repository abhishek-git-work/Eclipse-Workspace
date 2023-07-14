//dropdown without select class method

package Dropdown_Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrap_dropdown {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.opencart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);	
		
//************************************************************************************
		
		driver.findElement(By.xpath("//a[text()='Resources ']")).click();
		
		// driver.findElement(By.xpath("//li[@data-label='Email/SMS']")).click();
		
		List<WebElement> locations = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
		System.out.println(locations.size());
		
		for (int i=0; i<locations.size(); i++)
		{
			System.out.println(locations.get(i).getText());
		}
		
//*************************************************************************************	

// This can't be done as per select class method as given below because WebElement should have been "select" class but it was "a" class i.e. link		
		
//		WebElement x = driver.findElement(By.xpath("//a[text()='Resources ']"));
//		
//		Select s =new Select(x);
//		
//		int size = s.getOptions().size();
//		
//		System.out.println(size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
