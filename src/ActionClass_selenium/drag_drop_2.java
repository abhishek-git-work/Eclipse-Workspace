package ActionClass_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);	
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);       //switching to inner frame
		
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(img1, destination).perform();
		
		Thread.sleep(2000);
		
		act.dragAndDrop(img2, destination).perform();
		
		Thread.sleep(2000);
		
		act.dragAndDrop(img3, destination).perform();
		
		driver.switchTo().defaultContent();        //switching to default/main frame

		
		
	}

}
