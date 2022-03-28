package com.qa.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPageObjects;
import com.qa.testbase.BaseClass;
import com.qa.utilities.TestUtilities;

public class LoginPageTest extends BaseClass{
	
	public LoginPageObjects LO;
	public TestUtilities util;
	
	@BeforeClass
	public void beforeTest() {
		
		init();
		LO = new LoginPageObjects(driver);
		util = new TestUtilities();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		setup();
	}
	
	@Test(priority = 1)
	public void VerifyTitle() {
		
		extentTest = extent.startTest("verifytitle");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}
	

	@Test(priority = 2)
	public void LoginToCRM() throws InterruptedException {

		extentTest = extent.startTest("logintocrm");
		System.out.println(LO.SignUp());
		util.clickOn(driver, LO.SignUp(), 80);
		util.waitForPageLoad(driver, 60);
	
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");


		util.sendKeys(driver, LO.UserName(), prop.getProperty("username"), 60);
		//LO.UserName().sendKeys(prop.getProperty("username"));
		LO.PassWord().sendKeys(prop.getProperty("password"));

		//LO.enterCredentialsForLogin(prop.getProperty("username"), prop.getProperty("password"));
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	@AfterMethod
	public void endtest(ITestResult result) throws IOException {
		tearDown(result);
	}	

	@AfterClass
	public void endTest() {
		EndTest();
		endReport();
	}

}
