package com.chinadovey.power.webapps.util;

import java.io.IOException;
import java.util.Properties;

public class ConfUtils {
	public static final String PROPERTIES_URL = "/config/parking.properties";
	
	public static Properties loadConf(String res) throws IOException {
        Properties prop = new Properties();
		prop.load(ConfUtils.class.getResourceAsStream(res));
        return prop;
	}
	
	public static String getControlAddress() throws IOException{
		Properties prop = loadConf(PROPERTIES_URL);
		return  prop.getProperty("dovey.cloud.node.localaddress");
	}
	
	public static String getJdbcAddress() throws IOException{
		Properties prop = loadConf(PROPERTIES_URL);
		return  prop.getProperty("proxool.jdbc.url");
	}
	public static String getJdbcUsername() throws IOException{
		Properties prop = loadConf(PROPERTIES_URL);
		return  prop.getProperty("proxool.jdbc.username");
	}
	public static String getJdbcPwd() throws IOException{
		Properties prop = loadConf(PROPERTIES_URL);
		return  prop.getProperty("proxool.jdbc.password");
	}

	public static String getCloudUrlHead() throws IOException {
		Properties prop = loadConf(PROPERTIES_URL);
		return  prop.getProperty("cloud.carlock.server");
	}
}
