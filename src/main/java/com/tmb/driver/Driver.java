package com.tmb.driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.tmb.config.ConFigFactory;

public final class Driver {
	private Driver() {
	}

	// private static WebDriver driver;

	public static void initDriver() throws MalformedURLException {
		String browser = ConFigFactory.getConfig().browser();
		String runmode=ConFigFactory.getConfig().runmode();
		if (DriverManager.getDriver() == null) {
			WebDriver driver = DriverFactory.getDriver(runmode,browser);
			DriverManager.setDriver(driver);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(ConFigFactory.getConfig().timeout(),
					TimeUnit.SECONDS);
			DriverManager.getDriver().get(ConFigFactory.getConfig().url());
		}
	}

	public static void quitDriver() throws InterruptedException {
		if (DriverManager.getDriver() != null) {

			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
		}
	}
}
