package pop_up_selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_Tab {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
//*********************************************************************************
		
//		String x = driver.getWindowHandle();        //gives window ID
//		
//		System.out.println(x);
		
//*********************************************************************************
		
//		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//		
//		Set<String> x = driver.getWindowHandles();    //gives multiple window ID in List format
//		
//		System.out.println(x);                 
		
//*********************************************************************************

//		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//		
//		Set<String> x = driver.getWindowHandles();
//		
//		ArrayList<String> id = new ArrayList<String>(x);         //converting set into array list, so we can use it as indexing
//		
//		driver.switchTo().window(id.get(1));
//		
//		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
//		
//		driver.switchTo().window(id.get(0));
//		
//		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//		
//		Set<String> y = driver.getWindowHandles();
//		
//		ArrayList<String> id1 = new ArrayList<String>(y);
//		
//		driver.switchTo().window(id1.get(2));
//		
//		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
//		
//		driver.switchTo().window(id1.get(0));
//		
//		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//
//		Set<String> z = driver.getWindowHandles();
//		
//		ArrayList<String> id2 = new ArrayList<String>(z);
//		
//		driver.switchTo().window(id2.get(3));
//		
//		driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
//
//		driver.switchTo().window(id2.get(0));
		
//*************************same process - different method**************************************************************************

		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
			
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
			
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> y = driver.getWindowHandles();
		
		ArrayList<String> id1 = new ArrayList<String>(y);         //converting set into array list, so we can use it as indexing

		driver.switchTo().window(id1.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.switchTo().window(id1.get(2));
		
		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
		
		driver.switchTo().window(id1.get(3));
		
		driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();

		driver.switchTo().window(id1.get(0));
		

		
		
		
		
	}

}
