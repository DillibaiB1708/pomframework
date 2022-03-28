package com.qa.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.ContactPageObjects;
import com.qa.pageobjects.LoginPageObjects;
import com.qa.testbase.BaseClass;
import com.qa.utilities.TestUtilities;

public class VerifyHomePage extends BaseClass{
	

	ContactPageObjects CO;
	public TestUtilities TU;

	 
	 @BeforeClass
		public void beforeTest() {
			
			//init();
			CO = new ContactPageObjects(driver);
			TU = new TestUtilities();
			//driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			setup();
		}

	@Test(priority = 3)
	public void ContactsPage() {
		
		extentTest = extent.startTest("contacts page");
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(CO.Contacts()).build().perform();
		CO.NewCOntact().click();
		TU.waitForPageLoad(driver, 40);
		String text = CO.newcontactpage().getText();
		Assert.assertEquals(text, "Create New Contact");
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
