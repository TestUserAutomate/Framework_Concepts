package com.qa.pages.MobilesAndLaptops;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.amazon.selenium.base.SeleniumBase;


public class MobilesPage extends SeleniumBase {
	public  LGMobile clickLGMobile() {
		WebElement ele1 = driver.findElement(By.xpath("(//*[contains(text(),'LG')])[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele1);
		/*click(locateElement("xpath", "(//span[contains(text(),'Apple')])[6]"));*/
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new LGMobile();
	}
	
	public  OppoMobile clickOppoMobile() {
		
		WebElement ele1 = driver.findElement(By.xpath("(//*[contains(text(),'Opp')])"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele1);
	/*	click(locateElement("xpath", "(//*[contains(text(),'LG')])[2]"));*/
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new OppoMobile();
	}
	public  RealmeMobile clickRealmeMobile() {
		WebElement ele1 = driver.findElement(By.xpath("(//*[contains(text(),'Realme')])"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele1);
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new RealmeMobile();
	}

}
