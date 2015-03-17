package com.hgst.hawk.tests_packages.utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.hgst.hawk.automation.pages.LoginPage;
import com.hgst.hawk.automation.pages.LogoutPage;
import com.hgst.hawk.automation.selenium.Driver;


public class HawkTestBase {
	@BeforeTest
	public void init()	{
		Driver.initialize();
		LoginPage.goTo();
		LoginPage.loginAs("admin").withPassword("HGST").login();
	}
	
	@AfterTest
	public void cleanup()	{
		//LogoutPage.logout();
		//Driver.close();
	}
}
