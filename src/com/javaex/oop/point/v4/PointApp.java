package com.javaex.oop.point.v4;

// 메서드 오버로딩
class Point {
	protected int x; // 상속 받은 자식에서 접근 허용
	protected int y;
	
	//기본 생성자
//	public Point() {
//		
//	}
	
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

class ColorPoint extends Point {
	// 필드
	// x, y, draw는 상속 받는다
	private String color;
	
//	public ColorPoint() {
//		// 특별히 지정하지 않으면 부모의 기본 생성자 super를 선택한다
//	}
//	
	public ColorPoint(String color) {
//		super(0,0);
//		this.color = color;
		this(0, 0, color);
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); 
		this.color = color;
	}
	
	// getters/ setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// draw 메서드를 새로 선언한다
	@Override
	public void draw() {
		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.", x, y, color);
	}
	@Override
	public void draw(boolean bshow) {
		String message = String.format("색상점[x=%d, y=%d, color=%s]을 ", x , y, color);
		message += bshow ? "그렸습니다" : "지웠습니다";
		System.out.println(message);
		
		//오버라이드 했지만 부모의 기능을 사용해야 할 때
		super.draw(bshow);
	}
} 

// 포인트 상속 받아 ColorPoint 클래스
public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point a = new Point();
//		Point b = new Point();
//		a.setX(5);
//		a.setY(5);
//		b.setX(10);
//		b.setY(23);
		Point p1 = new Point(5 ,5);
		
//		a.draw();
//		b.draw();
		Point p2 = new Point(10 ,23);
		p1.draw(true);
		p1.draw(false);
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.draw();
		cp1.draw(true);
		
		ColorPoint cp2 = new ColorPoint(10, 10 ,"blue");
		cp2.draw();
		cp2.draw(false);
	}
}
