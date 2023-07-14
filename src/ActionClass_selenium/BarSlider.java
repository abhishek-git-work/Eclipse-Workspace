package ActionClass_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BarSlider {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		Actions act = new Actions(driver);
		
		WebElement first_slider = driver.findElement(By.xpath("//body/div[1]/span[1]"));
		System.out.println(first_slider.getLocation());
		act.dragAndDropBy(first_slider, -100, 0).perform();
		System.out.println(first_slider.getLocation());

		
		WebElement second_slider = driver.findElement(By.xpath("//body/div[2]/span[1]"));
		System.out.println(second_slider.getLocation());
		act.dragAndDropBy(second_slider, 100, 0).perform();
		System.out.println(second_slider.getLocation());

//*************************************************************************************************************************************		
				
//		driver.get("https://www.globalsqa.com/demo-site/sliders/#Steps");
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
//			
//		WebElement slider = driver.findElement(By.xpath("//span[@tabindex='0']"));	
//		System.out.println(slider.getLocation());		
//		act.dragAndDropBy(slider, 500, 0).perform();		
//		System.out.println(slider.getLocation());		

}
}
