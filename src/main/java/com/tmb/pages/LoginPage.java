package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentManager;
import com.tmb.utils.SeleniumUtils;

public class LoginPage {

	private static final  By TXTBOX_USERNAME=By.xpath("//input[@placeholder='Username']");
    private static final  By TXTBOX_PASSWORD=By.xpath("//input[@type='password']");
    private static final  By BTN_LOGIN=By.xpath("//button[@type='submit']");
    
    
    private LoginPage setUserName(String username) {
    	SeleniumUtils.sendKeys(TXTBOX_USERNAME,username);
    	ExtentLogger.pass("Username is entered succesfully");
    	return this;
    }
    
    private LoginPage setPassword(String password) {
    	SeleniumUtils.sendKeys(TXTBOX_PASSWORD,password);
    	ExtentLogger.pass("Password is entered succesfully");
    	return this;
    }
    
    private HomePage setLogin() {
    	SeleniumUtils.click((BTN_LOGIN));
    	ExtentLogger.pass("Login is clicked Successfully");
    	return new HomePage();
    }
    
    public HomePage loginToApplication(String username,String password) {//method chaining
    	return setUserName(username).setPassword(password).setLogin();
}
}
