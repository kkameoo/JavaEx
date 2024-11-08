package com.javaex.oop.shape.v2;

import java.util.Iterator;

public class ShapeApp {
	public static void main(String[] args) {
//		Shape s = new Shape(); -> 추상 클래스는 부모로서만 존재한다.
		
		Rectangle r = new Rectangle(10, 20, 100, 50);
//		r.draw();
		
		Circle c = new Circle(10, 10, 30);
//		c.draw();
		
		Point p = new Point(100, 160);
//		p.draw();
		
		Drawable[] objs = { r, c, p };
		
		
		
		
		// 특정 개체가 특정 인터페이스를 구현한 객체인가를 판단하려면
		
		for (Drawable a : objs) {
			
			if (a instanceof Drawable) {
				System.out.println(a + "은 Drawable의 구현체이다.");
			} else {
				System.out.println(a + "은 Drawable의 구현체가 아니다.");
			}
			
			a.draw();
		}
		
	}
}
