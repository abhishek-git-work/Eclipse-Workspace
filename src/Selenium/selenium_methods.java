package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_methods {
	
		public static void main(String[] args) {
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();     // upcasting
		
//		driver.get("https://www.youtube.com/");    //to open given URL
		
//		driver.close();                            //to close open URL tab
//		
//		driver.quit();                             //to close browser (all open tabs will close)
		
//		String title = driver.getTitle();          //to fetch title name of open URL - actual title
//		System.out.println(title);
		
//		String exptitle = "youtube";               //expected title
//		
//		if (title.equalsIgnoreCase(exptitle))      //comparing actual page title with expected title
//		{
//			System.out.println("Page valid");
//		}
//		else 
//		{
//			System.out.println("Page Invalid");
//		}
			
//		driver.manage().window().fullscreen();         //window fullscreen
//		driver.manage().window().maximize();           //window maximize
//		driver.manage().window().minimize();           //window minimize

//		driver.switchTo().newWindow(WindowType.TAB);	//open new tab in same window
//		
//		driver.get("https://www.gmail.com/");          //opening page in new tab
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);   //open new window
//		
//		driver.get("https://www.facebook.com/");      //opening page in new window
//		
//		driver.switchTo().newWindow(WindowType.TAB);    //open new tab in previous window
//		
//		driver.get("https://www.amazon.in/"); 			
		
	
		
//		String url = driver.getCurrentUrl();          //to fetch URL name of open URL - actual URL
//		System.out.println(url);
//		
//		String expurl = "https://www.youtube.com/";               //expected URL
//		
//		if (url.equalsIgnoreCase(expurl))                //comparing actual page URL with expected URL
//		{
//			System.out.println("Page valid");
//		}
//		else 
//		{
//			System.out.println("Page Invalid");
//		}
		
//		Dimension x = new Dimension(600, 400);        //creating object of Dimension from selenium library and giving dimension
//		driver.manage().window().setSize(x);          //setting size of window
	
//		Point y = new Point(300, 400);                //creating object of Point from selenium library and giving dimension
//		driver.manage().window().setPosition(y);      //setting position of window
		
//		System.out.println(driver.manage().window().getSize()); //get dimension of window
		
//		driver.navigate().to("https://www.facebook.com/");  //open new tab or overrides existing tab
//		driver.navigate().forward();                    // forward to next page
//		driver.navigate().back();                        // backward to previous page
//		driver.navigate().refresh();                     // refresh current page
		
//		driver.get("https://www.facebook.com/signup/");
//		WebElement x = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
//		String result = x.getText();
//		System.out.println(result);                   //give all text 
		
//		driver.get("https://www.facebook.com/signup/");
//		WebElement z = driver.findElement(By.xpath("//input[@type='password']"));
//		String result = z.getAttribute("class");
//		System.out.println(result);                      //give attribute value
		
//		driver.get("https://demo.nopcommerce.com/");
//		driver.findElement(By.xpath("//a[normalize-space()='Register']")).sendKeys(Keys.CONTROL,Keys.ENTER);  //opening link in new tab
		
//		driver.get("https://www.facebook.com/");	
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		
//		System.out.println("X,Y= "+logo.getLocation());                         //gives x and y coordinates
//		System.out.println("X= "+logo.getLocation().getX());                    //gives x coordinate
//		System.out.println("Y= "+logo.getLocation().getY());                    //gives y coordinate
//		
//		System.out.println("width, height= "+logo.getSize());                   //gives width and height
//		System.out.println("width= "+logo.getSize().getWidth());                //gives width
//		System.out.println("height= "+logo.getSize().getHeight());              //gives height
		
		
	}


}
