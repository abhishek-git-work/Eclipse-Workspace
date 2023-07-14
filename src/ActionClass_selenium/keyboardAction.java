package ActionClass_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement x = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		
		WebElement y = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		x.sendKeys("Welcome Abhishek");
		
//***************************importing keys method*****************************************		
	
		x.sendKeys(Keys.CONTROL + "a");
		
		x.sendKeys(Keys.CONTROL + "c");
		
		y.sendKeys(Keys.CONTROL + "v");
			
//***************************using Actions class method***********************************	

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		
//		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//		
//		act.sendKeys(Keys.TAB).perform();
//		
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
}

}
