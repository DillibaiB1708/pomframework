package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.BaseClass;



public class CustomListener extends BaseClass implements ITestListener{
	
	  public void onTestStart(ITestResult result) {
	  }
		  
	  public void onTestSuccess(ITestResult result) {
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("FAILED Test");
//		  FailedTC(result.getMethod().getMethodName());
	  }
	  
	  public void onTestSkipped(ITestResult result) {
	  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
