package com.tsr.beans;

import java.util.List;

public class CacheManager {

	private Cache cache;
	private List<IAccessor> accessor;

	public CacheManager(Cache cache, List<IAccessor> accessor) {
		super();
		this.cache = cache;
		this.accessor = accessor;
		init();
	}

	public void init() {
		for (IAccessor iAccessor : accessor) {
			String key = iAccessor.getKey();
			Object value = iAccessor.getData();
			cache.put(key, value);
		}
	}

}
