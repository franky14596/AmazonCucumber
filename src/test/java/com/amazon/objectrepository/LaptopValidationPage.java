package com.amazon.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.stepdefinitons.Hooks;

public class LaptopValidationPage extends Hooks{
	
	public LaptopValidationPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@type='text']") 
	private WebElement searchBox ;
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
}
