package com.stepdefinition;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends Base {
	Searchpage sp;
	@Given("user on amazon home page")
	public void user_on_amazon_home_page() {
		getDriver();
		sp=PageFactory.initElements(driver, Searchpage.class);
	  
	}

		

	@When("user enter item on search bar {string}")
	public void user_enter_item_on_search_bar(String string) {
	   sp.getSearchField(string);
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
	  sp.getsearchIcon();
	}

	@Then("user on search page")
	public void user_on_search_page() {
		Assert.assertEquals(sp.SearchItempage.getText(), "\"Qa testing\"");
	   
	}
}
