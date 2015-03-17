package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hgst.hawk.automation.selenium.Driver;

public class DashboardPage {

	public static boolean isAt() {
		WebElement tab = Driver.instance.findElement(By.id("tab-1029"));
		if(tab.isDisplayed())
			return true;
		return false;
	}
}