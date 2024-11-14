package com.javaex.practice09.ex04;

public abstract class Shape {
	protected int countSides;
	
	public Shape(int countSides) {
		// TODO Auto-generated constructor stub
		this.countSides = countSides;
	}
	
	public Shape() {
		
	}

	public int getCountSides() {
		return countSides;
	}
	
	public abstract double getArea();

	public abstract double getPerimeter();
}
