package ActionClass_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import practice.practice;

public class BarSlider_1 {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Goa&dest=Goa&destValue=Goa&depCity=Pune&initd=searchwidget_landing_Goa_notheme&dateSearched=25%2F03%2F2023&glp=false&rooms=3%2C0%2C1%2C0%2C%2C3%2C&affiliate=MMT##page_header");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='skipBtn']")).click();
		
//		Thread.sleep(15000);
		
//		driver.findElement(By.xpath("//button[text()='DIMISS']")).click();
		
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();
		
		WebElement x = driver.findElement(By.xpath("(//div[@class='rc-slider-handle rc-slider-handle-1'])"));
		
		Actions act = new Actions(driver);
		
		System.out.println(x.getLocation());
		
		Thread.sleep(5000);
		
		act.dragAndDropBy(x, 100, 0).perform();
		
		System.out.println(x.getLocation());
		
		WebElement y = driver.findElement(By.xpath("(//div[@class='rc-slider-handle rc-slider-handle-2'])[2]"));
		
		System.out.println(y.getLocation());
		
		Thread.sleep(5000);
		
		act.dragAndDropBy(y, -100, 0).perform();
		
		System.out.println(y.getLocation());
		
		
		
		
		
	}

}
