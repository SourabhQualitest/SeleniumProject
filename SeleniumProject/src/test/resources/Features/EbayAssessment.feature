#Author: sourabh
Feature: Login Validation for FlipKart

  Scenario: Validate Login for Valid Credentials
    Given The Ebay Web Page
    When User Name and Password are Entered
    Then Validate that Logged into Ebay Successfully

  Scenario: Login to FlipKart and click on Cart
    Given An Item to Search and purchase
    When click on Random Item based on search
    Then Add the Item Into Cart
    
