package com.tsr.beans;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CityRIPropsAccessor implements IAccessor {

	private String key;

	public CityRIPropsAccessor(String key) {
		super();
		this.key = key;
	}

	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public Object getData() {
		Properties properties = new Properties();
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("city-ri.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
