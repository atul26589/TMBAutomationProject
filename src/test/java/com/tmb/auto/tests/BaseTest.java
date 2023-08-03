package com.tmb.auto.tests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tmb.driver.Driver;
import com.tmb.reports.ExtentReport;

public class BaseTest {
	
	

	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initReports();
	}
	
	@AfterSuite
	public void afterSuite() {
		ExtentReport.flushReports();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		Driver.initDriver();
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Driver.quitDriver();	
	}
	}

