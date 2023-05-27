package com.tsr.map;

import java.util.Map;

public class Store {
	
	private String storeName;
	private String location;
	private int employeeCount;
	private Map<String, Integer> itemsWithPrices;
	
	public Store() {
		super();
	}
	
	public Store(String storeName, String location) {
		super();
		this.storeName = storeName;
		this.location = location;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Map<String, Integer> getItemsWithPrices() {
		return itemsWithPrices;
	}

	public void setItemsWithPrices(Map<String, Integer> itemsWithPrices) {
		this.itemsWithPrices = itemsWithPrices;
	}

	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", location=" + location + ", employeeCount=" + employeeCount
				+ ", itemsWithPrices=" + itemsWithPrices + "]";
	}

}
