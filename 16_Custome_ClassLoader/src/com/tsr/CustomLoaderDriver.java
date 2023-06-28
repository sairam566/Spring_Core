package com.tsr;

import java.lang.reflect.Method;

import test.classes.Sai;

public class CustomLoaderDriver {
	public static void main(String args[]) throws Exception {
		String progClass = args[0];

		SecurityClassLoader customLoader = new SecurityClassLoader(CustomLoaderDriver.class.getClassLoader());

		Class clas = customLoader.loadClass(progClass);
		// Below method is used to check that the Test is getting loaded by our custom
		// class loader
		Method printCL = clas.getMethod("greet", null);
		printCL.invoke(null, new Object[0]);

	}
}
