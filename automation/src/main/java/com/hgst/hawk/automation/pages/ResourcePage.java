package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hgst.hawk.automation.navigation.MenuSelector;
import com.hgst.hawk.automation.navigation.TopMenu;
import com.hgst.hawk.automation.selenium.Driver;

public class ResourcePage {

	public static void goTo() {
		MenuSelector.select(TopMenu.Resource);
		//WebElement rsTab = Driver.instance.findElement(By.id("tab-1030"));
		//rsTab.click();		
	}

	public static void goToTreeView() {
		// TODO Auto-generated method stub
		
	}

}
