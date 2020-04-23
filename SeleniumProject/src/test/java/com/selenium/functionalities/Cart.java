package com.selenium.functionalities;

import com.cucumber.stepfiles.BaseTest;
import com.selenium.ui.CartPage;

public class Cart extends BaseTest{

	CartPage carts=new CartPage(getDriver());
	public void clickOnCart(){
		
		carts.searchForItem();
		carts.clickOnItem();
	}
	
	public void search(){
		carts.searchForItem();
	}
	
	public void clickOnItems(){
		carts.clickOnItem();
	}
}
