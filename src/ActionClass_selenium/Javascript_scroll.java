package ActionClass_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_scroll {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(0,300)");   //scroll down
		
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(0,-300)");   //scroll up
		
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(3000,0)");    //scroll right
		
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(-3000,0)");    //scroll left


}
}