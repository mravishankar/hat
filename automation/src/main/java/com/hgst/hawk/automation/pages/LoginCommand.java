package com.hgst.hawk.automation.pages;

import org.openqa.selenium.By;
import com.hgst.hawk.automation.selenium.Driver;

public class LoginCommand {
	private CharSequence userName;
	private CharSequence passWord;	

	public LoginCommand(String username) {
		this.userName = (CharSequence) username;
	}

	public LoginCommand withPassword(String password) {
		this.passWord = (CharSequence) password;
		return this;
	}

	public void login() {
		Driver.instance.findElement(By.id("textfield-1014-inputEl")).sendKeys("admin");
		
		Driver.instance.findElement(By.id("textfield-1015-inputEl")).sendKeys("HGST");
		
		Driver.instance.findElement(By.id("button-1019-btnInnerEl")).click();
	}	
}
