package com.qa.ApplicationSpecifics;
import java.io.IOException;
import java.util.Random;

// Test- repo checkin sign out

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.amazon.selenium.base.SeleniumBase;

import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
		@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	  startApp("chrome", "https://www.amazon.in/");
	node = test.createNode(testcaseName);
  }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  close();
	  Thread.sleep(3000);
  }}