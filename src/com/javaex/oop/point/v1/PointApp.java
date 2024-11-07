package com.javaex.oop.point.v1;

class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
}

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point();
		Point b = new Point();
		a.setX(5);
		a.setY(5);
		b.setX(10);
		b.setY(23);
		
		a.draw();
		b.draw();
	}
}
