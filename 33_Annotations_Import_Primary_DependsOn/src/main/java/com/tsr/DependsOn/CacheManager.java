package com.tsr.DependsOn;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {
	
	public CacheManager() {
		System.out.println("cache manager created");
	}
}
