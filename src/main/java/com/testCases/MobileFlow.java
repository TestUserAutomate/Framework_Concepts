package com.testCases;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class MobileFlow extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		testcaseDec = "QA testing for Amazon site"; author="Nithin";
		category="Smoke";
	}




	@Test
	public void  TC_004_OppoMobileFunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickMobiles().clickOppoMobile();
		test.log(Status.INFO, "completed the Oppo Mobile Flow");
	}

	@Test
	public void  TC_005_LGMobileFunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickMobiles().clickLGMobile();
		test.log(Status.INFO, "completed the LG Mobile Flow");
	}
	@Test
	public void  TC_006_RealmeMobileFunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickMobiles().clickRealmeMobile();
		test.log(Status.INFO, "completed the Realme Mobile Flow");
	}


}


