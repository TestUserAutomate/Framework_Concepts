package com.qa.tooltip;

import com.amazon.selenium.base.SeleniumBase;

public class Television extends SeleniumBase{
	
	public SamsungTelevisionPage clickSamsungTvBrand(){
			click(locateElement("xpath", "(//a[contains(text(),'Samsung')])[11]"));
			return new SamsungTelevisionPage();
	}
	public OneplusTelevisionPage clickOneplusTvBrand(){
		
		
		click(locateElement("xpath", "(//a[contains(text(),'OnePlus')])[2]"));
		return new OneplusTelevisionPage();
}
}

