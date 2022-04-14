package com.amazon.stepdefinitons;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amazon.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ShoesValidation extends CommonActions {
	
	CommonActions ca = new CommonActions();
	
	@Given("User launches Amazon application")
public void user_launches_Amazon_application() {
	
}
@When("User searches shoes by one dim list")
public void user_searches_shoes_by_one_dim_list(DataTable dataTable) {
    List<String> shoelist = dataTable.asList();
    String shoename = shoelist.get(0);
    
    WebElement search = Hooks.driver.findElement(By.id("twotabsearchtextbox"));
    ca.inserttext(search, shoename);
}

@When("user clicks shoe")
public void user_clicks_shoe() {
   WebElement product = Hooks.driver.findElement(By.xpath("(//span[contains(text(),'Puma')])[6]"));
   String shoename = product.getText();
   System.out.println(shoename);
  ca.click(product);

}

@Then("user validates the outcomes")
public void user_validates_the_outcomes() {
	ca.singlewindowhandle();
}

}
