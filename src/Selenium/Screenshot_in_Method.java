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

public class Screenshot_in_Method {
	
	public static void screenshot() throws IOException
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup/");
		
		SimpleDateFormat formatter = new SimpleDateFormat ("dd-MM-yyyy__hh_mm_ss"); 
	    Date date = new Date();  
	    String x = formatter.format(date);
				
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		File destination = new File("D:\\Software testing\\Selenium notes\\sc\\datetime"+x+".jpg");
				
	 	FileHandler.copy(source, destination);	
	}
	
	public static void main(String[] args) throws IOException {
		
		Screenshot_in_Method.screenshot();

}
}