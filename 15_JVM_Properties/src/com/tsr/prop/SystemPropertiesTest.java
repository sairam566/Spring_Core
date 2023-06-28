package com.tsr.prop;

import java.util.Properties;

public class SystemPropertiesTest {

	public static void main(String[] args) {

		Properties jvmProperties = System.getProperties();
		jvmProperties.forEach((key, value) -> {
			System.out.println(key + " = " + value);
		});
		
	}

}
