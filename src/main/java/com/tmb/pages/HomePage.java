package com.tmb.pages;

import com.tmb.driver.DriverManager;

public class HomePage {

	//HomePage has TopMenu -->Composition
	private TopMenuComponent topMenuComponent;
	
	public HomePage() {
		topMenuComponent=new TopMenuComponent();	
	    
	}
	
	public String getHomePageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	public void clickAdmin(){
		topMenuComponent.clickAdmin();
		}
}
