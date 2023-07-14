package pop_up_selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
	
	public static void main(String[] args) throws IOException, InterruptedException {
				
		WebDriver driver = new ChromeDriver(); // upcasting
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");    //original URL
		
		//we have to provide username and password along with URL
		//syntax= https://username:password@URL
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

}
}