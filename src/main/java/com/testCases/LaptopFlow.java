package com.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.pages.AmazonHomePage;

public class LaptopFlow extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		  testcaseDec = "QA testing for Amazon site"; author="Nithin";
		  category="sanity";
	}
	
	
	
	
	@Test
	public void  TC_001_AppleLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers()
		.clickLaptops().clickAppleLaptop();
		test.log(Status.INFO,"TC001_Successfully Executed");
                                                                        }
	
	@Test
	public void  TC_002_AsusLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers()
		.clickLaptops().clickAsusLaptop();
		test.log(Status.INFO,"TC002_Successfully Executed");
                                                                       
	}
	@Test
	public void  TC_003_AcerLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers()
		.clickLaptops().clickAcerLaptop();
		test.log(Status.INFO,"TC003_Successfully Executed");
                                                                       
	}
	


}


