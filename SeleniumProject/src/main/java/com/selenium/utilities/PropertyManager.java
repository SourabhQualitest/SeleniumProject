package com.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class load all the properties from properties file
 * @author sourabh.g
 *
 */

public class PropertyManager {

	private String filePath=System.getProperty("user.dir")+"//configuration.properties";
	private  String driver;
	private  String appUrl;

	public PropertyManager() {
		Properties prop= new Properties();
		try {
			prop.load(new FileInputStream(new File(filePath)));
			driver=prop.getProperty("driverUsed");
			appUrl=prop.getProperty("appUrl");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public  String getDriver(){
		return driver;
	}
	public  String getAppUrl(){
		return appUrl;
	}

}
