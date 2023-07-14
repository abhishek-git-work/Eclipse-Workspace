//fetching all links present in facebook home page

package Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fetch_Multiple_links {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Chrome version 111\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // upcasting
		
		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));       //all links are start with tagname "a"
		
		System.out.println(links.size());                   //gives size of links
		
		for (int i=0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getText()+ ":" +links.get(i).getAttribute("href"));   //gives text of links and attribute value of href
		}
		
		
	}

}
