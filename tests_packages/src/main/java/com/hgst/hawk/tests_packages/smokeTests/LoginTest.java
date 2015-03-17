package com.hgst.hawk.tests_packages.smokeTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.hgst.hawk.automation.pages.DashboardPage;
import com.hgst.hawk.tests_packages.utilities.HawkTestBase;

public class LoginTest extends HawkTestBase	{
	@Test
	public void admin_login()	{
		AssertJUnit.assertTrue("Failed to Login", DashboardPage.isAt());
	}
}