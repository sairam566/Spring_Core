package com.tsr.beans;

import java.util.Properties;

public class LoanManager {

	private Cache cache;

	public Cache getCache() {
		return cache;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public double interestAmount(long principle, int tenure, String city) throws Exception {
		float ri = 0.0f;
		Properties props = null;
		double interestAmount = 0.0;

		if (cache.containsKey("RI") == false) {
			throw new Exception("data not loaded into cahe");
		}
		props = (Properties) cache.get("RI");

		if (props.containsKey(city) == false) {
			throw new Exception("city not supported");
		}
		ri = Float.parseFloat(String.valueOf(props.get(city)));
		interestAmount = (principle * tenure * ri) / 100;
		return interestAmount;
	}
}
