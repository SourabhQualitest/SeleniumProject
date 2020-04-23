package com.selenium.functionalities;

import com.cucumber.stepfiles.BaseTest;
import com.selenium.ui.EbayLoginPage;

public class Login extends BaseTest{

	EbayLoginPage ebay=new EbayLoginPage(getDriver());
	
	public void  openEbayDotCom(){
		ebay.checkFortheLoginPage();
	}

	public void enterUserNameAndPassword(){
		ebay.enterLoginCredentials();
	}

	public void validateLogin(){
		ebay.ValidateLogin();
	}
}
