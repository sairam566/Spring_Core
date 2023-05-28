package com.tsr.byname;

public class Engine {
	
	private String modelNo;
	private int serialNo;
	private String name;
	
	public Engine() {
		super();
	}

	public Engine(String modelNo, int serialNo) {
		super();
		this.modelNo = modelNo;
		this.serialNo = serialNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [modelNo=" + modelNo + ", serialNo=" + serialNo + ", name=" + name + "]";
	}
	
}
