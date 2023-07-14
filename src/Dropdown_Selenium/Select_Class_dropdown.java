package Dropdown_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_dropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://www.facebook.com/signup/");
		
//------------------------------------------------------------------------------------	
		
//		WebElement x = driver.findElement(By.xpath("(//select[@name='birthday_day'])"));
//		Select s = new Select(x);
//		s.selectByIndex(12);                        //date will be 11
//		s.selectByValue("12");
//		s.selectByVisibleText("29");
//
//		int listsize = s.getOptions().size();
//		System.out.println(listsize);                  //size of listbox
//		
//		System.out.println(s.getFirstSelectedOption().getText());  //give text of selected list
		
//-------------------------------------------------------------------------------------
		
		WebElement y = driver.findElement(By.xpath("(//select[@name='birthday_month'])"));
		Select m = new Select(y);
//		m.selectByIndex(12);                           //month will be 11
//		m.selectByValue("12");
		m.selectByVisibleText("Dec");
		
		List<WebElement> options = m.getOptions();
		int size = options.size();
		System.out.println(size);                      //size of listbox
		for (int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());   //all list will print
		}

		System.out.println(m.getFirstSelectedOption().getText());  //give text of selected list

//		List<WebElement> alloptions = m.getAllSelectedOptions();
//		for (int i=0; i<=alloptions.size(); i++)
//		{
//			System.out.println(alloptions.get(i).getText());       //give multiple selected text
//		}
		
//		boolean result = m.isMultiple();                  //gives true if list is select multiple options or false if single option 
//		System.out.println(result);
		
		
//-------------------------------------------------------------------------------------
		
//		WebElement z = driver.findElement(By.xpath("(//select[@name='birthday_year'])"));
//		Select year = new Select(z);
//		year.selectByIndex(23);                         //year will be 2000
//		year.selectByValue("2000");
//		year.selectByVisibleText("2013");
		

//		List<WebElement> options = year.getOptions();
//		int size = options.size();
//		System.out.println(size);
//		for (int i=0; i<=options.size(); i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		

}
}