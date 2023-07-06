package com.tsr.beans;

public class Rectangle {
	private double length;
	private double breadth;
	private double area;
	
	public Rectangle(double length) {
		super();
		this.length = length;
	}

	public void init() {
		System.out.println("Rectangle Initialized");
		this.area = this.length * this.breadth;
	}
	
	public void release() {
		System.out.println("Rectangle destroyed");
		this.area = 0;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
}
