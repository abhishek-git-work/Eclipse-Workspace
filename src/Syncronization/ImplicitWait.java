//it will apply to all script

package Syncronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //deprecated method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //new method
	
}
}