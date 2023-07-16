package com.tsr.method.replace;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class PlanFinderReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

		String methodName = method.getName();
		StringBuilder builder = new StringBuilder();
		builder.append(methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				builder.append(args[i]);
				continue;
			}
			builder.append(", " + args[i]);
		}
		builder.append(")");

		System.out.println("From Method Replacer : " + builder.toString());

		return Arrays.asList(new String[] { "plan1", "plan2" });
	}

}
