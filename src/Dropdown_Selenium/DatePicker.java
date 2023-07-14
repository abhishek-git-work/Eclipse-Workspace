package Dropdown_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");

//declaring date, month, year which has to be given*******************************************	

		String year = "2023";
		String month = "Oct";
		String date = "10";
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

//month & year selection*************************************************************************	
		
		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[] = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		}
				
//date selection*******************************************************************************		
		
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
				
		for (WebElement i:alldates)
		{
			String dt = i.getText();
			
			if(dt.equals(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
	}

}
