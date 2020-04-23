package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Cucumber Runner Class
 * @author sourabh.g
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"com/cucumber/stepfiles"},monochrome=true
)
public class TestRunner   {

	
	
}
