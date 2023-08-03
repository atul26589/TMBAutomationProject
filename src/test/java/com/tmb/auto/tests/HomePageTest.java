package com.tmb.auto.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tmb.driver.DriverManager;
import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import testData.TestData;

public class HomePageTest extends BaseTest {

	@DataSupplier
	public StreamEx<TestData> getData(){
		return TestDataReader.use(XlsxReader.class)
	          .withTarget(TestData.class)
	            .withSource("testdata.xlsx")
	            .read()
	            .filter(testdata -> testdata.testCasename.equalsIgnoreCase("titleValidationTest"));
	}

	@Test(description = "to check whether the user can login to orangehrm application & validate the page title", dataProvider="getData")
	public void loginHomePageTest(TestData testdata) throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.loginToApplication(testdata.username, testdata.password);
		// driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(DriverManager.getDriver().getTitle());
		Thread.sleep(15000);
		HomePage homePage=new HomePage();
		String actual=homePage.getHomePageTitle();
		Assert.assertEquals(actual, testdata.expectedTitle);
      
	}

}
