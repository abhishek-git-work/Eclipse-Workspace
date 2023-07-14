package Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log4j2_1 {
	
	public static void main(String[] args) {	
		
		Logger log = LogManager.getLogger(Log4j2_1.class.getName());
		log.debug("Test execution has started");                                   //for general logs
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		log.debug("Chrome browser has luanch and maximized");
		
		driver.get("https://www.amazon.in/");
		log.debug("amazon website has launch");
		
		driver.findElement(By.xpath("//a[normalize-space()='Amazon miniTV']")).click();
		log.debug("Amazon miniTV tab get clicked");
		
		driver.navigate().back();
		log.debug("back to amazon website home page");
		
		if (driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			log.info("Successful: Title got correct");         //for successful logs
		}
		else
		{
			log.error("Failed: fetch Title was not correct");    //for failure logs
		}
		
		driver.close();
		log.debug("driver closed");

//before configuring log4j2.xml file, if test got success no log will printed and if test got failed by default error log which is log.error get printed with timestamp
//after configuring log4j2.xml all logs will printed.		
		
	}

}
