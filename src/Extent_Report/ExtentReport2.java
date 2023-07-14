//adding test in report

package Extent_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport2 {
	
	public static void main(String[] args) throws IOException {

//configuration (mandatory)
		ExtentReports extentreport = new ExtentReports();		
		File extentReportFile = new File("extentReport.html");		
		ExtentSparkReporter sparkreport = new ExtentSparkReporter(extentReportFile);
		extentreport.attachReporter(sparkreport);
		
//creating test and giving status and description						
		extentreport.createTest("test1").log(Status.FAIL, "fail test");
		extentreport.createTest("test2").log(Status.PASS, "pass test");
		extentreport.createTest("test3").log(Status.SKIP, "Skip test");
		extentreport.createTest("test3").log(Status.WARNING, "warning test");
		extentreport.createTest("test3").log(Status.INFO, "info test");
			
//mandatory at the end of all report		
		extentreport.flush();
		
//to open report directly into default browser
		Desktop.getDesktop().browse(new File("extentReport.html").toURI());
	}

}
