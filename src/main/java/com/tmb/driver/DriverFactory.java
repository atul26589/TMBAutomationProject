package com.tmb.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tmb.config.ConFigFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverFactory {
	
	private DriverFactory() {}
	public static WebDriver getDriver(String runmode,String browserName) throws MalformedURLException {
		WebDriver driver=null;
		if(runmode.equalsIgnoreCase("local")) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
			else {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		}else if(runmode.equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			if(browserName.equalsIgnoreCase("chrome")) {
				capabilities.setBrowserName("chrome");
				}
				else if (browserName.equalsIgnoreCase("firefox")) {
					capabilities.setBrowserName("edge");
					
				}
			driver=new RemoteWebDriver(new URL(ConFigFactory.getConfig().remoteurl()),capabilities);
		}
		
		return driver;
	}
}
