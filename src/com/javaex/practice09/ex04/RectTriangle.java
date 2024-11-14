package com.javaex.practice09.ex04;

public class RectTriangle extends Shape{
	double width;
	double height;
	
	
	@Override
	public double getArea() {
		double area = (width * height) / 2;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)) + width + height;
		return perimeter;
	}
	
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}
}
