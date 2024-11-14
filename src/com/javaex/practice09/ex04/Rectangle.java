package com.javaex.practice09.ex04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;
	
	
	
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}


	public void resize(double s) {
		width *= s;
		height *= s;
	}
	
	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = (width*2) + (height*2);
		return perimeter;
	}
}
