package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.amazon.selenium.base.SeleniumBase;

public class OneplusTelevisionPage extends SeleniumBase {
	
	public void testBasePrice(){
		TypeAndClick("//*[@id='twotabsearchtextbox']","one plus television");
/* driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("one plus television",Keys.ENTER);*/
		} 
	public void get2DaysDelivery(){
		TypeAndClick("//*[@id='twotabsearchtextbox']","one plus television");
		driver.findElement(By.xpath("(//*[@class='a-icon a-icon-checkbox'])[2]")).click();
		List<WebElement> elementName=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(elementName.size());
	}

}
