//these settings are only for chrome browser. it will vary browser to browser.

package File_download_upload;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
	
	public static void main(String[] args) throws InterruptedException {
		                             		
		String downloadFilepath = System.getProperty("user.dir");                 //setting download location to current workspace
		
		HashMap preferences = new HashMap();                                      //importing hashmap
		preferences.put("download.default_directory", downloadFilepath);          //download file path setup
		// preferences.put("plugins.always_open_pdf_externally", true);           //only for pdf, if pdf opens in view mode instead of direct download
		
		ChromeOptions options = new ChromeOptions();                              //creating options class instance 
		options.setExperimentalOption("prefs", preferences);

		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("automation testing");
		
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		

//*****************checking file downloaded in desired location or not**************************
		
//		File file = new File(downloadFilepath+"\\info.txt");
//		
//		if (file.exists())
//		{
//			System.out.println("file downloaded successfully");
//		}
//		else 
//		{
//			System.out.println("file not downloaded till yet");
//		}
		
		
		
		


}
}