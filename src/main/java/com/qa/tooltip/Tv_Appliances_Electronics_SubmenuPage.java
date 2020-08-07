package com.qa.tooltip;

import org.openqa.selenium.By;

import com.amazon.selenium.base.SeleniumBase;

public class Tv_Appliances_Electronics_SubmenuPage extends SeleniumBase {

	public Television clickTelevision(){
		/*driver.findElement(By.xpath("(//*[contains(text(),'Television')])[2]")).click();*/
		
		click(locateElement("xpath","(//*[contains(text(),'Television')])[2]"));
		return new Television();
		}
	public Headphones clickHeadPhones(){
		click(locateElement("xpath","//a[contains(text(),'Headphones')]"));
		return new Headphones();
		}
	public Cameras clickCameras(){
		click(locateElement("xpath","//a[contains(text(),'Cameras')]"));
		return new Cameras();
		}
	
	public GamingConsoles clickGamingConsoles(){
		click(locateElement("xpath","//a[contains(text(),'Gaming Consoles')]"));
		return new GamingConsoles();
		}
}
