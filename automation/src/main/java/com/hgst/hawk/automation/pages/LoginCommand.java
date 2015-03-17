package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import com.hgst.hawk.automation.selenium.Driver;

public class LoginCommand {
	private CharSequence userName;
	private CharSequence passWord;	

	public LoginCommand(CharSequence username) {
		this.userName = username;
	}

	public LoginCommand withPassword(CharSequence password) {
		this.passWord = password;
		return this;
	}

	public void login() {
		Driver.instance.findElement(By.id("textfield-1014-inputEl")).sendKeys(userName);
		
		Driver.instance.findElement(By.id("textfield-1015-inputEl")).sendKeys(passWord);
		
		Driver.instance.findElement(By.id("button-1019-btnInnerEl")).click();
	}	
}
