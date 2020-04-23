package com.cucumber.stepfiles;

import com.selenium.functionalities.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepFile {

	@Given("^The Ebay Web Page$")
	public void The_Ebay_Web_Page() throws Throwable {
	 
		new Login().openEbayDotCom();
	}
	
	@When("^User Name and Password are Entered$")
	public void enterUserNameAndPassword(){
		
		new Login().enterUserNameAndPassword();
	}
	
	@Then("^Validate that Logged into Ebay Successfully$")
	public void logOutFromFlipKart(){
		
		new Login().validateLogin();
	}
}
