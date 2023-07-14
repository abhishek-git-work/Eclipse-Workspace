package Extent_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport4 {
	
	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");

//configuration (mandatory)
		ExtentReports extentreport = new ExtentReports();		
		File extentReportFile = new File("extentReport.html");		
		ExtentSparkReporter sparkreport = new ExtentSparkReporter(extentReportFile);
		extentreport.attachReporter(sparkreport);
		
//adding screenshot to report		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("ExtentReportScreenshot.jpg");
		FileHandler.copy(source, destination);
		
		extentreport.createTest("testForScrrenshot").addScreenCaptureFromPath("ExtentReportScreenshot.jpg");

//mandatory at the end of all report		
		extentreport.flush();
				
//to open report directly into default browser
		Desktop.getDesktop().browse(new File("extentReport.html").toURI());
	}

}
