package pop_up_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permission_notification_popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
				
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(3000);
		
		driver.get("https://www.redbus.in/");
		
		
	}

}
