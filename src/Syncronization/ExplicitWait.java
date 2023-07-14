//The below code instructs Selenium WebDriver to wait for 10 seconds before throwing a TimeoutException. 
//it will finds specific webElement with fixed polling frequency of 0.5 seconds. If it finds the element before 10 seconds, then it will return immediately. 
//After that, it will click on the “Compose” button. 
//In this case, the program will not wait for the entire 10 seconds, thus saving time and executing the script faster.
//it will apply to specific webElement.

package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='1']"))).click();   //web-element which we have to give explicit wait

		//if xpath is wrong in this it will give error of "TimeoutException" not as "NoSuchElementException"
		
		

}
}