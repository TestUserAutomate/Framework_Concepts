package com.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class dropDownTest extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		  testcaseDec = "QA testing for Amazon site"; author="Nithin";
		  category="sanity";
	}
	
	@Test
	public void dropDownDealsTest() {
		new AmazonHomePage().dropDownClick().dropDownDeals();
	}
	
	@Test
	public void dropDownApplianceTest() {
		new AmazonHomePage().dropDownClick().dropDownAppliances();
	}
	
	@Test
	public void dropDownElectronicsTest() {
		new AmazonHomePage().dropDownClick().dropDownElectronics();
	}
	
	@Test
	public void dropDownkindleStoreTest() {
		new AmazonHomePage().dropDownClick().dropDownKindleStore();
	}
	
	@Test
	public void dropDownWatchesTest() {
		new AmazonHomePage().dropDownClick().dropDownWatches();
	}

}
