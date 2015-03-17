package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
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
		Driver.instance.findElement(By.id("textfield-1014-inputEl")).sendKeys(userName);
		
		Driver.instance.findElement(By.id("textfield-1015-inputEl")).sendKeys(passWord);
		
		Driver.instance.findElement(By.id("button-1019-btnInnerEl")).click();
	}	
}
