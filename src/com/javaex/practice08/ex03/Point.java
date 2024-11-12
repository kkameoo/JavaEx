package com.javaex.practice08.ex03;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성 하세요
	@Override
	public String toString() {
		if (this instanceof Point) {
			return String.format("[포인트] x:%d, y:%d 입니다.", x , y);
		}
		return super.toString();
	}
}
