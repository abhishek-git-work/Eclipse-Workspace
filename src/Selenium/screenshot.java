package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot {
	
	public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver(); 
	
	driver.get("https://www.facebook.com/signup/");

//-------------------------single screenshot----------------------------------------------
	
//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	File destination = new File("D:\\Software testing\\Selenium notes\\sc\\abc.jpg");
//	
//	FileHandler.copy(source, destination);
	
//-------------------------multiple screenshot---------------------------------------------	
	
//	for (int i=1; i<=10; i++)
//	{
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("D:\\Software testing\\Selenium notes\\sc\\new"+i+".jpg");
//		
//		FileHandler.copy(source, destination);
//	}
	
//-------------------------multiple screenshot with random method---------------------------------------------	

//	for (int i=1; i<=10; i++)
//	{
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		String random = RandomString.make(4);      //it will print random 4 alphanumeric after name
//		
//		File destination = new File("D:\\Software testing\\Selenium notes\\sc\\abhi"+random+".jpg");
//		
//		FileHandler.copy(source, destination);
//	}
	
//------------------------screenshot with current date and time-----------------------------------
	
// 	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");    //HH for 24hrs and hh for 12hrs
//  Date date = new Date();  
//  String x = formatter.format(date);
	
//	// String x = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss").format(new Date());
	
//		
//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//	File destination = new File("D:\\Software testing\\Selenium notes\\sc\\DateTime"+x+".jpg");
//		
//	FileHandler.copy(source, destination);


}
}