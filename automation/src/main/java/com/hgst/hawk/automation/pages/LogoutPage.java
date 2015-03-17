package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hgst.hawk.automation.navigation.MenuSelector;
import com.hgst.hawk.automation.navigation.TopMenu;
import com.hgst.hawk.automation.selenium.Driver;

public class LogoutPage {
	public static void logout() {
		MenuSelector.select(TopMenu.Logout);
		//WebElement logoutInput = Driver.instance.findElement(By.id("logoutButton-btnIconEl"));
		//logoutInput.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}