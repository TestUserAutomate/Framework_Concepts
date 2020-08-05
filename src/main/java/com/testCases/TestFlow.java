package com.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.pages.AmazonHomePage;

public class TestFlow extends  ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		  testcaseDec = "QA testing for Amazon site"; author="Nithin";
		  category="sanity";
	}
	
	@Test
	public void  TC_001_AppleLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers();
                                                                        }




@Test
public void  TC_002_AppleLaptopFunctionality () throws IOException{
	
	new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics();
                                                                    }
}