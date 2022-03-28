package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseClass;

public class LoginPageObjects extends BaseClass{
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li/a[text()='Sign Up']")
//	@FindBy(xpath="//div[@id='navbar-collapse']/ul/li[2]/a[text()='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath="//div[@id='ui']/div/div/form/div/div/div/input[@name='email']")
//	@FindBy(xpath = "//input[@name = 'email']")
	WebElement Username;

	@FindBy(xpath = "//input[@name = 'password']")
	WebElement Password;
	
	@FindBy(xpath = "//div[text() = 'Login']")
	WebElement Login;

	
	public WebElement SignUp() {
		return signup;
	}
	public WebElement UserName() {
		return Username;
	}
	
	public WebElement PassWord() {
		return Password;
	}
	
	public WebElement Login() {
		return Login;
	}
	
	public void enterCredentialsForLogin(String username, String password) {
		
		Username.sendKeys(username);
		Password.sendKeys(password);
	}
	
	

}
