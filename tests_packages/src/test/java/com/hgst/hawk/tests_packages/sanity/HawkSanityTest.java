package com.hgst.hawk.tests_packages.sanity;

import org.testng.AssertJUnit;
import com.hgst.hawk.automation.testlib.TestbedRuntimeInfo;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hgst.hawk.automation.pages.ActionsPage;
import com.hgst.hawk.automation.pages.AnalyticalPage;
import com.hgst.hawk.automation.pages.DashboardPage;
import com.hgst.hawk.automation.pages.LoginPage;
import com.hgst.hawk.automation.pages.LogoutPage;
import com.hgst.hawk.automation.pages.LogsPage;
import com.hgst.hawk.automation.pages.NotificationPage;
import com.hgst.hawk.automation.pages.RepairPage;
import com.hgst.hawk.automation.pages.ResourcePage;
import com.hgst.hawk.automation.selenium.Driver;


public class HawkSanityTest {
	@BeforeTest
	public void init()	{
		Driver.initialize();
		LoginPage.goTo();
		LoginPage.loginAs(TestbedRuntimeInfo.getMasterUiUser()).withPassword(TestbedRuntimeInfo.getMasterUiPass()).login();
	}
	
	@Test
	public void admin_login()	{
		AssertJUnit.assertTrue("Failed to Login", DashboardPage.isAt());
	}
	
	@Test
	public void resource_tab_test()	{		
		ResourcePage.goTo();
	}
	
	@Test
	public void actions_tab_test()	{
		ActionsPage.goTo();
	}
	
	@Test
	public void analytical_tab_test()	{
		AnalyticalPage.goTo();
	}
	
	@Test
	public void logs_tab_test()	{
		LogsPage.goTo();
	}
	
	@Test
	public void notification_tab_test()	{
		NotificationPage.goTo();
	}
	
	@Test
	public void repair_tab_test()	{
		RepairPage.goTo();
	}
	
	@AfterTest
	public void cleanup()	{
		LogoutPage.logout();
		Driver.close();
	}
}
