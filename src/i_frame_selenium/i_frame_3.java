package i_frame_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_frame_3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dezlearn.com/iframe-example/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='ml-webforms-popup-3672985']"));
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@id='iframe1'])[1]"));
				
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
		
		driver.switchTo().defaultContent();

}
}