package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseClass;

public class ContactPageObjects extends BaseClass{
	
	public ContactPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newcontact;
	
	@FindBy(xpath="//div[@class='ui loader']/following-sibling::text()[1]")
	WebElement newcontactpage;

	
	public WebElement Contacts() {
		return contacts;
	}
	
	public WebElement NewCOntact() {
		return newcontact;
	}
	
	public WebElement newcontactpage() {
		return newcontactpage;
	}
	 

}
