package com.qa.ApplicationSpecifics;

import java.io.IOException;
import java.util.Random;
import java.io.IOException;
import java.util.Random;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.amazon.selenium.base.SeleniumBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.DataLibrary;



public class ProjectSpecificMethods extends SeleniumBase {
	/*	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}*/	
  
    /*@BeforeSuite
	public void reportSetup() {
	startReport("QA", "Naren", "Chrome");
	
}*/
	
  @BeforeMethod
  public void beforeMethod() {
	  startApp("chrome", "https://www.amazon.in/");
	 reportSetup("QA", "Naren", "chrome");
	 
  }
  
  public void reportSetup(String environment,String Tester_name,String browser)  {
	
		  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		  htmlReporter.config().setDocumentTitle("Automation Report"); //Title of the report
		  htmlReporter.config().setReportName("Functional Report"); //Name of the report
		  htmlReporter.config().setTheme(Theme.DARK);
		  
		  extent=new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  extent.setSystemInfo("Environment",environment);
		  extent.setSystemInfo("Browser", browser);
		  extent.setSystemInfo("HostName", "Local");
		  extent.setSystemInfo("OS", "Windows");
		  extent.setSystemInfo("Tester Name", Tester_name);
		  
	}
 
 
  @AfterMethod
  public void afterMethod(ITestResult result) throws InterruptedException {
	  if(result.getStatus()== ITestResult.FAILURE) {
		  test.log(Status.FAIL, "Test case failed is"+result.getName()); //to add name in the extent report
	  }else if(result.getStatus()==ITestResult.SKIP){
		  test.log(Status.SKIP, "Test case skipped is"+result.getName()); 
	  }else if(result.getStatus()==ITestResult.SUCCESS){
		  test.log(Status.PASS, "Test case passed is"+result.getName()); 
	  }
	  
	  close();
	  Thread.sleep(3000);
	  extent.flush();
  }}