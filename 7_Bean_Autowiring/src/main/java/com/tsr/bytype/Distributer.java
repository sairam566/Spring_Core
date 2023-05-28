package com.tsr.bytype;

public class Distributer {
	
	private int no;
	private String name;
	
	public Distributer() {
		super();
	}

	public Distributer(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Distributer [no=" + no + ", name=" + name + "]";
	}
	
}
