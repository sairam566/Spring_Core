package com.tsr.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	private static Cache cache;
	private Map<String, Object> dataMap;

	private Cache() {
		System.out.println("Cache constructor called");
		dataMap = new ConcurrentHashMap<String, Object>();
	}

	public static Cache getInstance() {
		if (cache == null) {
			cache = new Cache();
		}
		return cache;
	}

	public boolean containsKey(String key) {
		return dataMap.containsKey(key);
	}

	public void put(String key, Object value) {
		dataMap.put(key, value);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}
}
