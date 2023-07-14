package Checkbox_RadioButtons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> x = driver.findElements(By.xpath("//form[contains(text(),'My favourite colors are:')]//input"));
		
		System.out.println(x.size());
		
		for (WebElement color:x)
		{
				color.click();
		}
		
		Thread.sleep(3000);
		
		for (WebElement color:x)
		{
			String box = color.getAttribute("value");
			if (box.equalsIgnoreCase("orange") || box.equalsIgnoreCase("red") || box.equalsIgnoreCase("purple"))
			{
				color.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
