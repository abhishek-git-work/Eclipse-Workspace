package ActionClass_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		act.dragAndDrop(source, destination).perform();   //type-1
		
//		act.clickAndHold(source).release(destination).build().perform();    //type-2
		
		//from newer version, no need to use build method for combining two or more methods in single action.
	}

}
