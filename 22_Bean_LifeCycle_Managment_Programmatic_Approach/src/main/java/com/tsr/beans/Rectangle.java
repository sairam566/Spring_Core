package com.tsr.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle implements InitializingBean,DisposableBean{
	private double length;
	private double breadth;
	private double area;
	
	public Rectangle(double length) {
		super();
		this.length = length;
	}
	
//	public void init() {
//		System.out.println("Rectangle Initialized");
//		this.area = this.length * this.breadth;
//	}
//	
//	public void release() {
//		System.out.println("Rectangle destroyed");
//		this.area = 0;
//	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Rectangle afterPropertiesSet() method called");
		this.area = this.length * this.breadth;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Rectangle destroy() method called");
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

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area=" + area + "]";
	}
}
