package com.javaex.practice07.ex01;

public class ShapeApp {
	public static void main(String[] args) {
		
//		Shape S = new Shape("빨강"); -> 스스로 객체가 될 수 없다
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		// sr1을 그리는 메소드 호출
		sr1.draw();
		// sr1의 가로크기 출력
		Ractangle other = (Ractangle)sr1;
		System.out.println("sr1의 가로는 " + other.getWidth() + " 입니다." );
	}
}
