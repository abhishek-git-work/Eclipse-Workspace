package pop_up_selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_Tab2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com//");  Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[1]")).click(); Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[2]")).click(); Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[3]")).click(); Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[4]")).click(); Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[5]")).click(); Thread.sleep(4000);
		
		Set<String> x = driver.getWindowHandles();
		
		ArrayList<String> id = new ArrayList<String>(x);
		
		driver.switchTo().window(id.get(0));  Thread.sleep(4000);
		
		driver.switchTo().window(id.get(1));  Thread.sleep(4000);
		
		driver.switchTo().window(id.get(2));  Thread.sleep(4000);
		
		driver.switchTo().window(id.get(3));  Thread.sleep(4000);
		
		driver.switchTo().window(id.get(4));  Thread.sleep(4000);
		
		driver.switchTo().window(id.get(5));  Thread.sleep(4000);

		
		
		

		
		
		

}
}