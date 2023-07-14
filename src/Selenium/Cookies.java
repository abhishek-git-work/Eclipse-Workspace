package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		Set<Cookie> allcookies = driver.manage().getCookies();    //getting all cookies
		
		System.out.println(allcookies.size());                    //get size of cookies
		
//***********************************************************************************	
		
		for (Cookie cook:allcookies)                              //printing name and value of cookies
		{
			System.out.println(cook.getName()+" :  : "+cook.getValue());
		}
		
//**********************************************************************************
		
		Cookie newcky = new Cookie("abc123", "12345");        //creating object of cookie by giving name and value attribute into constructor
		
		driver.manage().addCookie(newcky);                    //adding new cookie
		
		Set<Cookie> newallcookies = driver.manage().getCookies();     //getting all cookies
		
		System.out.println(newallcookies.size());                     //get size of cookies
		
		for (Cookie cook:newallcookies)                            //printing name and value of cookies
		{
			System.out.println(cook.getName()+" :  : "+cook.getValue());
		}

//***********************************************************************************
		
//		driver.manage().deleteCookie(newcky);             //deleting cookie by object name
		
		driver.manage().deleteCookieNamed("abc123");      //deleting cookie by cookie name
		
		Set<Cookie> newallcookies1 = driver.manage().getCookies();     //getting all cookies
		
		System.out.println(newallcookies1.size());                     //get size of cookies
		
		for (Cookie cook:newallcookies1)                            //printing name and value of cookies
		{
			System.out.println(cook.getName()+" :  : "+cook.getValue());
		}

//***********************************************************************************
		
		driver.manage().deleteAllCookies();           //delete all cookies
		
		Set<Cookie> newallcookies2 = driver.manage().getCookies();     //getting all cookies
		
		System.out.println(newallcookies2.size());                     //get size of cookies

		
		
		
		
		
	}

}
