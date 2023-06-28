package com.tsr.beans;

public class Engine {
	
	private String modelNo;
	private String name;

	public Engine() {}

	public Engine(String modelNo, String name) {
		this.modelNo = modelNo;
		this.name = name;
		System.out.println("from Parameter constructor");
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
		System.out.println("from ModelNo Setter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("from Name Setter");
	}

	@Override
	public String toString() {
		return "Engine [modelNo=" + modelNo + ", name=" + name + "]";
	}
	
}
