package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hgst.hawk.automation.selenium.Driver;

public class LoginPage {
	public static void goTo()	{
		Driver.instance.navigate().to(Driver.getBaseAddress());
		WebDriverWait wait = new WebDriverWait(Driver.instance, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("textfield-1014-inputEl")));
	}

	public static LoginCommand loginAs(String userName) {
		return new LoginCommand(userName);		
	}
}