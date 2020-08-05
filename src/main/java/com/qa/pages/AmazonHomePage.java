 package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;

public class AmazonHomePage extends ProjectSpecificMethods{
	
	public ToolTipPage tooltipClick() throws IOException {
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		test.log(Status.INFO,"tool tip has been clicked successfully");
	/*	test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "    Tooltip clicked");*/
		return new ToolTipPage();
	}

}
