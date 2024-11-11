package com.javaex.api.objectclass.ex02;

// object ex02
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object object) {
		// obj가 Point ? 
		if (object instanceof Point) {
			// 다운캐스팅
			Point other = (Point)object;
			return x == other.x && y == other.y;
		}
		return super.equals(object);
	}
	
}
