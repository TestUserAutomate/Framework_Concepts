package com.qa.pages.MobilesAndLaptops;

import com.amazon.selenium.base.SeleniumBase;


public class LaptopsPage extends SeleniumBase {
	
	public  AppleLaptop clickAppleLaptop() {
		click(locateElement("xpath", "(//span[contains(text(),'Apple')])[6]"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new AppleLaptop();
	}
	public  AsusLaptop clickAsusLaptop() {
		click(locateElement("xpath", "(//span[contains(text(),'Asus')])[3]"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new AsusLaptop();
	}

	
	public  AcerLaptop clickAcerLaptop() {
		click(locateElement("xpath", "(//span[contains(text(),'Acer')])[6]"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new AcerLaptop();
	}

}
