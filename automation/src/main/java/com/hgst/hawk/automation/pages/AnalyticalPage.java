package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hgst.hawk.automation.navigation.MenuSelector;
import com.hgst.hawk.automation.navigation.TopMenu;
import com.hgst.hawk.automation.selenium.Driver;

public class AnalyticalPage {
	public static void goTo() {
		MenuSelector.select("Analytical");
		//WebElement analyticatTab = Driver.instance.findElement(By.id("tab-1032"));
		//analyticatTab.click();		
	}
}
