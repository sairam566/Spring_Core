package com.tsr.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectTracker {
	
	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public static void increment() {
		atomicInteger.incrementAndGet();
	}
	
	public static int getCounter() {
		return atomicInteger.intValue();
	}
}
