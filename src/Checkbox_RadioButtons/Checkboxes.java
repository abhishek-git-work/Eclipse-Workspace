package Checkbox_RadioButtons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static void main (String[] arg) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//*****************************selecting single check-box*********************************************		
		
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
//*****************************selecting all check-boxes*********************************************		
		
//		List<WebElement> chkboxes = driver.findElements(By.xpath("//div//label//input[@type='checkbox']"));
//		
//		System.out.println(chkboxes.size());
//		
//		for (int i=0; i<chkboxes.size(); i++)
//		{
//			chkboxes.get(i).click();
//		}
		
//*************************selecting starting check-boxes*********************************************		
		
//		List<WebElement> chkboxes = driver.findElements(By.xpath("//div//label//input[@type='checkbox']"));
//		
//		for (int i=0; i<chkboxes.size(); i++)
//		{
//			if(i<3) 
//			{
//				chkboxes.get(i).click();
//			}
//		}	
		
//*************************selecting ending check-boxes*********************************************		
		
//		List<WebElement> chkboxes = driver.findElements(By.xpath("//div//label//input[@type='checkbox']"));
//		
//		for (int i=0; i<chkboxes.size(); i++)
//		{
//			if(i>3) 
//			{
//				chkboxes.get(i).click();
//			}
//		}		
		
//*************************selecting multiple check-boxes*********************************************		
	
//		List<WebElement> chkboxes = driver.findElements(By.xpath("//div//label//input[@type='checkbox']"));
//
//		for (int i=0; i<chkboxes.size(); i++)
//		{
//			String chkboxname = chkboxes.get(i).getAttribute("id");
//			if(chkboxname.equalsIgnoreCase("monday") || chkboxname.equalsIgnoreCase("sunday") || chkboxname.equalsIgnoreCase("wednesday"))
//			{
//				chkboxes.get(i).click();
//			}
//		}
	
					//**********by enhanced for loop***************
		
//		List<WebElement> chkboxes = driver.findElements(By.xpath("//div//label//input[@type='checkbox']"));
//		
//		for(WebElement box:chkboxes)
//		{
//			String chkboxname = box.getAttribute("id");
//			if(chkboxname.equalsIgnoreCase("monday") || chkboxname.equalsIgnoreCase("Wednesday") || chkboxname.equalsIgnoreCase("sunday"))
//			{
//				box.click();
//			}
//		}
		
		
		
		
	}

}
