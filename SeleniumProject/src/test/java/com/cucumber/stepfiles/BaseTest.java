package com.cucumber.stepfiles;

import org.openqa.selenium.WebDriver;
import com.selenium.utilities.Settings;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * THis class contains the basic test to launch URL
 * @author sourabh.g
 *
 */
public class BaseTest {
	@Before
	public void beforeSuite() {
		Settings.setUpSeleniumPreRequisites();
		Settings.launchUrl();
	}

	@After
	public void afterSuite() {
		//Settings.closeBrowser();
	}

	public WebDriver getDriver() {
		return Settings.getDriver();

	}
}
