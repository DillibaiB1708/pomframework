package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/com/qa/configuration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void init() {

		// System.setProperty("webdriver.chrome.driver",  "/Users/bdillibai/Documents/EclipseWorkspace/pomframework/src/test/resources/com/qa/configuration/chromedriver 4");
		//System.setProperty("webdriver.chrome.driver", "/Users/bdillibai/Documents/EclipseWorkspace/pomframework/src/test/resources/com/qa/configuration/chromedriver 6");
		//System.setProperty("Webdriver.chrome.driver", chromedriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

}
