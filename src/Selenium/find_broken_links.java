package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class find_broken_links {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // upcasting
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));       //all links are start with tagname "a"

		System.out.println(links.size()); 
		
		for (int i=0; i<links.size(); i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);                                           //creating object of URL
			HttpURLConnection con = (HttpURLConnection) link.openConnection(); //creating connection using URL object "link"
//			Thread.sleep(3000);
			con.connect();                                                     //establish connection
			
			int response = con.getResponseCode();                              //getting response code. if it is >400 then it is broken link
			
			if(response >=400)
			{
				System.out.println(url+"-----"+ " broken link");
			}
			else
			{
				System.out.println(url+"-----"+ " valid link");
			}
		}
		
		
		
		
}
}
