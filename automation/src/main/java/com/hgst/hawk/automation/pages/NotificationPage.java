package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hgst.hawk.automation.navigation.MenuSelector;
import com.hgst.hawk.automation.navigation.TopMenu;
import com.hgst.hawk.automation.selenium.Driver;

public class NotificationPage {
	public static void goTo() {
		MenuSelector.select("Notification");
		//WebElement notifyTab = Driver.instance.findElement(By.id("tab-1034"));
		//notifyTab.click();		
	}
}
