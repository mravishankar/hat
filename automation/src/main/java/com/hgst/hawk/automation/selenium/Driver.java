package com.hgst.hawk.automation.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hgst.hawk.automation.testlib.TestbedRuntimeInfo;

public class Driver {

	public static WebDriver instance;
	public static String BaseAddress;

	public static String getBaseAddress() {
		BaseAddress = "http://"+TestbedRuntimeInfo.getMasterIp()+":8000";
		return BaseAddress;
	}

	public static WebDriver getInstance() {
		return instance;
	}

	public static void setInstance(WebDriver instance) {
		Driver.instance = instance;
	}
	
	public static void initialize()	{
		instance = new FirefoxDriver();
		instance.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public static void close() {
		instance.close();
	}

}
