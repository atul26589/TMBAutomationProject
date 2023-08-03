package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public class TopMenuComponent {

	private By lnkAdmin = By.id("menu_admin_viewAdminModule");

	public void clickAdmin() {
		DriverManager.getDriver().findElement(lnkAdmin).click();
	}
}
