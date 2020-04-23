package com.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This call contains the methods to initialize the browers and launch the URL
 * and Controls the DRiver Object
 * @author sourabh.g
 *
 */
public class Settings {

	private static WebDriver driver;
	private static String applicationUrl;
	private static String broweserNeeded;
	
	
	public static void setUpSeleniumPreRequisites(){
		PropertyManager prop=new PropertyManager();
		applicationUrl=prop.getAppUrl();
		broweserNeeded=prop.getDriver();
		intializeBrowser(broweserNeeded);
	}
	
	public static void intializeBrowser(String driver){
		if("chrome".equalsIgnoreCase(driver)){
			getChromeBrowserInstance();
		}
		else if("fireFox".equalsIgnoreCase(driver)){
			getFireFoxInstance();
		}
	}
	
	public static void getChromeBrowserInstance(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getInternetExplorerInstance(){
		//Yet to add the code for Internet Explorer driver Instantiation
	}
	
	public static void getFireFoxInstance(){
		driver=new FirefoxDriver();
	}
	public static WebDriver getDriver(){
		return driver;
	}
	public static void launchUrl(){
		driver.get(applicationUrl);
		
	}
	public static void closeBrowser(){
		if(null != driver) {
            driver.close();
            System.out.println("Calling driver Quit Method");
            driver.quit();
        }
	}
}