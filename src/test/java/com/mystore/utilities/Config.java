package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

	Properties properties;
	
	String path = "C:\\Users\\Dell\\eclipse-workspace\\MyStoreV1\\Configuration\\config.properties";
	
	public Config() {
		try {
		properties = new Properties();
		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	
	}
	
	public String getBaseUrl(){
		
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url is not specified in Config.properties");
	}
	
public String getBrowser(){
		
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not specified in Config.properties");
	}

public String emailid() {
	String id = properties.getProperty("id");
	if(id!=null)
		return id;
	else
		throw new RuntimeException("id is not specified in Config.properties");
}

public String getPassword()
{
	String password = properties.getProperty("password");
	if(password!=null)
		return password;
	else
		throw new RuntimeException("password not specified in config file.");
	
}
}
	

