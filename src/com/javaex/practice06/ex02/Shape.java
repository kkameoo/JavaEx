package com.javaex.practice06.ex02;

public class Shape{
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		// TODO Auto-generated constructor stub
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}
}
