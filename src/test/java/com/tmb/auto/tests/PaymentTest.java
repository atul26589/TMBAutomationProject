package com.tmb.auto.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tmb.driver.DriverManager;

public class PaymentTest extends BaseTest {
	
	@Test()
	public void Test2() throws InterruptedException {
	DriverManager.getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	DriverManager.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(10000);
	Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");

}
}
