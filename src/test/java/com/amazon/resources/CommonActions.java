package com.amazon.resources;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.amazon.stepdefinitons.Hooks;


public class CommonActions  {
	
	public void inserttext(WebElement we , String value) {
		we.sendKeys(value,Keys.ENTER);
	}

	public void click(WebElement we) {
		we.click();
	}
	
	public void singlewindowhandle () {
		String parenttab = Hooks.driver.getWindowHandle();
		Set<String> alltabs = Hooks.driver.getWindowHandles();
		for(String x : alltabs) {
			if(!parenttab.equals(alltabs)) {
				Hooks.driver.switchTo().window(x);
	}
		}
	}
}
