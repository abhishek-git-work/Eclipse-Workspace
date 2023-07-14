package Dropdown_Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sorted_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		Thread.sleep(5000);
		
		WebElement alltab = driver.findElement(By.name("category_id"));
		
		Select x = new Select(alltab);
		
		List<WebElement> options = x.getOptions();
		
		ArrayList originallist = new ArrayList();
		
		ArrayList templist = new ArrayList();
		
		for (WebElement option:options)
		{
			originallist.add(option.getText());     //storing every option value in original arraylist
			templist.add(option.getText());         //storing every option value in temp arraylist

		}
		
		System.out.println("original list: "+ originallist );
		System.out.println("temp list: "+ templist );
		
		Collections.sort(templist);         //sorting
		
		System.out.println("original list: "+ originallist );
		System.out.println("temp list after sorting: "+ templist );

		
		
		
	
}
}