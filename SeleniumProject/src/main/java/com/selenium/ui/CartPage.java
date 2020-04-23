package com.selenium.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * THis class contains methods to search and add the item into search
 * @author sourabh.g
 *
 */
public class CartPage extends BasePage{
	
	
	String searchText="65-inch TV";
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id='gh-ac']")
	WebElement searchBox;
	@FindBy(xpath="//*[@id='mainContent']//*[@class='srp-controls__count-heading']")
	WebElement serachResultCount;
	@FindBy(xpath="//*[@id='srp-river-results-listing2']")
	WebElement selectBasedOnCount;
	@FindBy(xpath="//*[@id='gh-btn']")
	WebElement serachButton;
	@FindBy(xpath="//*[@id='srp-river-results']//*[@class='srp-results srp-list clearfix']//a[@class='s-item__link']")
	WebElement selectItem;
	
	
	
	public void searchForItem(){
		if(searchBox.isDisplayed()){
			searchBox.sendKeys(searchText);
			serachButton.click();
		}
	}
	
	public int checkForResults(){
		int randomNumber=0;
		if(serachResultCount.isDisplayed()){
			System.out.println("Results are displayed");
			String text=serachResultCount.getText();
			int totalResultCount=Integer.parseInt(text.split(" ")[0]);
			randomNumber= getRandomNumber(totalResultCount);
		}
		return randomNumber;
	}
	
	public int getRandomNumber(int maxLimit){
		return (int) (Math.random()*maxLimit);
	}
	
	public void clickOnItem(){
		String linkText="QN65Q7FAMFXZA 65-Inch 4K Ultra HD QLED Smart TV - 4K HDR Elite - 240 Motion Rate";
		String xpath="//*[@id='srp-river-results']//*[@class='srp-results srp-list clearfix']//a[@class='s-item__link']//*[contains(text(),'LG Electronics')]";
		int randomNum=checkForResults();
		javaScriptWait();
		WebElement itemList=driver.findElement(By.xpath(xpath));
		System.out.println("clicking on Link");
		//itemList.click();
		
		Actions builder= new Actions(driver);
		Action mouseHoverAndClick=builder.moveToElement(itemList).click().build();
		mouseHoverAndClick.perform();
		


	}
}
