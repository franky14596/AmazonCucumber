package com.amazon.stepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amazon.objectrepository.LaptopValidationPage;
import com.amazon.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopValidation extends CommonActions {
      CommonActions ca = new CommonActions();
      LaptopValidationPage lvp = new LaptopValidationPage();
	
	
	
	@Given("User Launches Amazon application")
	public void user_Launches_Amazon_application() {
					   
	}

	@When("User searches Laptop{string}")
	public void user_searches_Laptop(String laptops) {
	
		WebElement search = Hooks.driver.findElement(By.id("twotabsearchtextbox"));
		ca.inserttext(search, laptops);
	}

	@When("user clicks laptop")
	public void user_clicks_laptop() {
		
		WebElement product = Hooks.driver.findElement(By.xpath("(//span[contains(text(),'Laptop')])[4]"));
	   
		ca.click(product);
	}

	@Then("user Validates the outcomes")
	public void user_Validates_the_outcomes() {
		ca.singlewindowhandle();
	    
	}
}
