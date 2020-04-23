package com.cucumber.stepfiles;

import com.selenium.functionalities.Cart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CartStepFile {
	
	@Given("^An Item to Search and purchase$")
	public void seachItem(){
		new Cart().search();
	}
	
	@When("^click on Random Item based on search$")
	public void clickOnItem(){
		new Cart().clickOnItems();
	}
}
