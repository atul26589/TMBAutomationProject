package com.tmb.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tmb.reports.ExtentLogger;

public class TestListener implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		ExtentLogger.pass(result.getName()  + " is passed");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	ExtentLogger.fail(result.getName() +" is failed");	
	}
	@Override
	public void onTestFailure(ITestResult result) {
	
}

@Override
public void onStart(ITestContext context) {
	
}
@Override
public void onFinish(ITestContext context) {
	
}

	
}
