package com.javaex.oop.point.v3;

// 메서드 오버로딩
class Point {
	private int x;
	private int y;
	
	//기본 생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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
	
	// 메서드 오버로딩
	public void draw(boolean bshow) {
		String message = String.format("점[x=%d, y=%d]을 ", x , y);
//		message += bshow ? "그렸습니다" : "지웠습니다";
		if (bshow) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
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
		
//		a.draw();
//		b.draw();
		a.draw(true);
		a.draw(false);
		b.draw(true);
		b.draw(false);
	}
}
