package com.hgst.hawk.test_packages.unitTests;

import org.testng.annotations.Test;
import com.hgst.hawk.automation.testlib.TestbedRuntimeInfo;

public class TestTestBedInfo {
	@Test
	public static void read_json()	{
		String BaseAddress = "http://"+TestbedRuntimeInfo.getMasterIp()+":8000";
		System.out.println(BaseAddress);		
	}
}