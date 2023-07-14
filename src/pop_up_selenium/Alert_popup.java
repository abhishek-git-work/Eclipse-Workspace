package pop_up_selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

//---------------------------------------------------------------------------------
		
//		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
//		
//		Alert a = driver.switchTo().alert();   //using alert method for handling pop-up
//		
//		Thread.sleep(2000);				
//		
//		a.accept();                               //to accept pop-up
//		
//		Thread.sleep(2000);
		
//----------------------------------------------------------------------------------
		
//		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
//		
//		Thread.sleep(2000);
//		
//		Alert a = driver.switchTo().alert();   
//		
//		// a.accept();
//		
//		a.dismiss();                             //to cancel pop-up

//----------------------------------------------------------------------------------
		
//		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
//		
//		Alert a = driver.switchTo().alert();   
//		
//		//  a.dismiss();
//		
//		Thread.sleep(2000);
//		
//		a.sendKeys("Yes");
//		
//		Thread.sleep(2000);
//		
//		a.accept();
		
		
		
		

		


		
		
	}


}
