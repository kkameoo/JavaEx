package com.javaex.practice07.ex01;

public class Ractangle extends Shape{
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height) {
		super(fillColor);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("[사각형]#면색:" + super.fillColor + " " + " #가로:" + width + " #세로:" + height + "그렸습니다.");
	}
}
