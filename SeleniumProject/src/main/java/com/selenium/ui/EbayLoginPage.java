package com.selenium.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;


/**
 * This Class Contains all the functionality of Login
 * @author sourabh.g
 *
 */
public class EbayLoginPage extends BasePage {

	@FindBy(linkText="Sign in")
	WebElement loginButton;
	@FindBy(id="userid")
	WebElement userNameBox;
	@FindBy(id="pass")
	WebElement passwordBox;
	@FindBy(xpath="//button[@id='sgnBt']")
	WebElement loginSubmitButton;
	@FindBy(xpath="//*[@id='areaTitle']/h1")
	WebElement title;
	
	public EbayLoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * This method will click on sign in link in ebay home page
	 */
	public void checkFortheLoginPage(){
		try {
			System.out.println("click on login button");
			loginButton.click();

		} catch (Exception e) {
			System.out.println("Sign In link is not visible");
		}

	}
	
	/**
	 * this method will enter the UserName and password and clicks on submit button
	 */
	public void enterLoginCredentials(){
		if(userNameBox.isDisplayed() && passwordBox.isDisplayed()){
			userNameBox.sendKeys("souri041@gmail.com");
			passwordBox.sendKeys("indiaindia12");
			loginSubmitButton.click();
		}
	}
	
	public void ValidateLogin(){
		System.out.println("Validating Login");
		Assert.assertEquals("Please verify yourself to continue", title.getText().toString());
		
	}
}
