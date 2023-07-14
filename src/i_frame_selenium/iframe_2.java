package i_frame_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default	");
	
//	driver.findElement(By.xpath("//button[@type='button']")).click();  //it will not work as this functionality is present in iframe
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	
	driver.switchTo().frame(iframe);  //switching to iframe
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();  //it will not work as this functionality is present in iframe

	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();   //switch to default/main page
	
//	driver.switchTo().parentFrame();      //switch to parent iframe
	
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();

}
}
