package com.tmb.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.tmb.config.ConFigFactory;

public final class DriverManager {
	
	private DriverManager() {}
	
	private static final ThreadLocal<WebDriver> threadlocal = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return threadlocal.get();
	}

	public static void setDriver(WebDriver driver) {
		threadlocal.set(driver);
	}

	

	
}
