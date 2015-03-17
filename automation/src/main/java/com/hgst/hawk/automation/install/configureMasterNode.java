package com.hgst.hawk.automation.install;

import com.hgst.hawk.automation.testlib.TestbedRuntimeInfo;
import com.jcraft.jsch.*;
import java.io.*;
import java.util.ArrayList;

public class configureMasterNode {

	/*public static int configureNode(String masterNode) {
		String host = testbedRuntimeInfo.getMasterIp();
		String user = testbedRuntimeInfo.getMasterUser();
		String password = testbedRuntimeInfo.getMasterPass();
		ArrayList<String> commands = testbedRuntimeInfo.getMasterCommands();

		for (String command : commands) {
			try {

				java.util.Properties config = new java.util.Properties();
				config.put("StrictHostKeyChecking", "no");
				JSch jsch = new JSch();
				Session session = jsch.getSession(user, host, 22);
				session.setPassword(password);
				session.setConfig(config);
				session.connect();
				
				Channel channel = session.openChannel("exec");
				((ChannelExec) channel).setCommand(command);
				channel.setInputStream(null);
				((ChannelExec) channel).setErrStream(System.err);

				InputStream in = channel.getInputStream();
				channel.connect();
				byte[] tmp = new byte[1024];
				while (true) {
					while (in.available() > 0) {
						int i = in.read(tmp, 0, 1024);
						if (i < 0)
							break;
					}
					if (channel.isClosed()) {
						return channel.getExitStatus();
					}
					try {
						Thread.sleep(1000);
					} catch (Exception ee) {
						ee.printStackTrace();
					}finally	{
						channel.disconnect();
						session.disconnect();
					}
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}*/
}
