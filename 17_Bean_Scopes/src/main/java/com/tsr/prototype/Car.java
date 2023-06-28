package com.tsr.prototype;

public class Car {
	private int id;
	private String modelNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", modelNo=" + modelNo + "]";
	}
	
}
