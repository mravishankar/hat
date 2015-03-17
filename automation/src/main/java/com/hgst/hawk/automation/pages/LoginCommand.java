package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hgst.hawk.automation.selenium.Driver;

public class LoginCommand {
	private String userName;
	private String passWord;	

	public LoginCommand(String username) {
		this.userName = username;
	}

	public LoginCommand withPassword(String password) {
		this.passWord = password;
		return this;
	}

	public void login() {
		WebElement loginInput = Driver.instance.findElement(By.id("textfield-1014-inputEl"));
		loginInput.sendKeys(userName);
		
		WebElement passInput = Driver.instance.findElement(By.id("textfield-1015-inputEl"));
		passInput.sendKeys(passWord);
		
		WebElement loginButton = Driver.instance.findElement(By.id("button-1019-btnInnerEl"));
		loginButton.click();
	}	
}
