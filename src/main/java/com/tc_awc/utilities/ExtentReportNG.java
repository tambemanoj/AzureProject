package com.tc_awc.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tc_awc.constants.PropertiesOperations;



public class ExtentReportNG {
	static ExtentReports extent;

	public static ExtentReports setupExtentReport() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);
		
		String reportPath = System.getProperty("user.dir")+
				"/Reports/ExecutionReport_"+actualDate+".html";
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReport);
		
		sparkReport.config().setDocumentTitle("DocumentTitle");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setReportName("Teamcenter AWC Automation Report");
	
		
		extent.setSystemInfo("Executed on Environment: ", PropertiesOperations.getPropertyValueByKey("url"));
		extent.setSystemInfo("Executed on Browser: ", PropertiesOperations.getPropertyValueByKey("browser"));
		extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		extent.setSystemInfo("Executed by User: ", System.getProperty("user.name"));

		return extent;
	}


}
