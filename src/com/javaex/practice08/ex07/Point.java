package com.javaex.practice08.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	
	public boolean equals(Object obj) {
        if (obj instanceof Point) {
        	Point other = (Point)obj;
			return other.x == x;
		}
        return super.equals(obj); 
    }

}
