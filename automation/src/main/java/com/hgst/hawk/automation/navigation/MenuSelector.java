package com.hgst.hawk.automation.navigation;

import org.openqa.selenium.By;
import com.hgst.hawk.automation.selenium.Driver;


public class MenuSelector {
	public static void select(String menuId)	{
		/*switch(menuId)	{
			case "Actions":
				Driver.instance.findElement(By.id("tab-1031")).click();
				break;
			case "Analytical":
				Driver.instance.findElement(By.id("tab-1032")).click();
				break;
			case "Dashboard":
				Driver.instance.findElement(By.id("tab-1029")).click();
				break;
			case "Logout":
				Driver.instance.findElement(By.id("logoutButton-btnIconEl")).click();
				break;
			case "Logs":
				Driver.instance.findElement(By.id("tab-1035")).click();
				break;
			case "Notification":
				Driver.instance.findElement(By.id("tab-1034")).click();
				break;
			case "Repair":
				Driver.instance.findElement(By.id("tab-1033")).click();
				break;
			case "Resource":
				Driver.instance.findElement(By.id("tab-1030")).click();
				break;				
		}*/
		if(menuId.contentEquals("Actions"))
			Driver.instance.findElement(By.id("tab-1031")).click();
		else if(menuId.contentEquals("Analytical"))
			Driver.instance.findElement(By.id("tab-1032")).click();
		else if(menuId.contentEquals("Dashboard"))
			Driver.instance.findElement(By.id("tab-1029")).click();
		else if(menuId.contentEquals("Logout"))
			Driver.instance.findElement(By.id("logoutButton-btnIconEl")).click();
		else if(menuId.contentEquals("Logs"))
			Driver.instance.findElement(By.id("tab-1035")).click();
		else if(menuId.contentEquals("Notification"))
			Driver.instance.findElement(By.id("tab-1034")).click();
		else if(menuId.contentEquals("Repair"))
			Driver.instance.findElement(By.id("tab-1033")).click();
		else if(menuId.contentEquals("Resource"))
			Driver.instance.findElement(By.id("tab-1030")).click();
	}
}