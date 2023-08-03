package com.tmb.utils;

import com.tmb.config.ConFigFactory;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitType;
import com.tmb.reports.ExtentLogger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	public static void click(By by) {
		WebElement element = waitUntilElementPresent(by);
		element.click();
	}
	
	public static void click(By by, WaitType waitType) {
		WebElement element = null;

		if (waitType == WaitType.PRESENCE) {
			element = waitUntilElementPresent(by);
		} else if(waitType==WaitType.CLICKABLE) {
			element=waitUntilElementPresent(by);
		}
		element.click();
	}

	public static void sendKeys(By by, String value) {
		WebElement element = waitUntilElementPresent(by);
		element.sendKeys(value);
ExtentLogger.pass(value +" Entered succesfully");
	}

	private static WebElement waitUntilElementPresent(By by) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConFigFactory.getConfig().timeout());
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

}
