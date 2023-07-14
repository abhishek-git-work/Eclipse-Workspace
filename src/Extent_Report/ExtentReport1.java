//creating blank report

package Extent_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport1 {
	
	public static void main(String[] args) throws IOException {

//configuration (mandatory)
		ExtentReports extentreport = new ExtentReports();		
		File extentReportFile = new File("extentReport.html");		
		ExtentSparkReporter sparkreport = new ExtentSparkReporter(extentReportFile);
		extentreport.attachReporter(sparkreport);

//mandatory at the end of all report		
		extentreport.flush();
				
//to open report directly into default browser
		Desktop.getDesktop().browse(new File("extentReport.html").toURI());
	}

}
