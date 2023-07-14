package Dropdown_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest_options_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
				
		List<WebElement> langueges = driver.findElements(By.xpath("//ul//li"));
				
		System.out.println(langueges.size());
		
		for (WebElement lang:langueges)
		{
			System.out.println(lang.getText());
			System.out.println();
		}	

		
		for (WebElement lang:langueges)
		{
			if(lang.getText().contains("Java"))
			{
				lang.click();
				break;
			}
		}
	
	
	
	
	
	
	
}
}
