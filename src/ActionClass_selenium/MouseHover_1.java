//modified list-box

package ActionClass_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_1 {
	
	public static void main(String[] args) throws InterruptedException {		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act = new Actions(driver);                    //creating object of action class
		
		WebElement x = driver.findElement(By.xpath("//a[text()='Login']"));
		
//		act.moveToElement(x).perform();
		
		WebElement wish = driver.findElement(By.xpath("//div[text()='Wishlist']"));
		
//		act.click(wish).perform();
		
		act.moveToElement(x).moveToElement(wish).click().perform();     
		
		
//		act.contextClick(wish).perform();  //use for right click action
		
		
		
		
		
		
		
		
		
	}

}
