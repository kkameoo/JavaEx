package com.javaex.practice09.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
	public static void main(String[] args) {
		Shape r1 = new Rectangle(5.0, 6.0);
		Shape t1 = new RectTriangle(6.0, 2.0);
		
		List<Shape> sList = new ArrayList<>();
		sList.add(r1);
		sList.add(t1);
		
		for(Shape s : sList) {
			System.out.println("area: " + s.getArea());
			System.out.println("perimeter: " + s.getPerimeter()); 
			if (s instanceof Rectangle) {
				((Rectangle) s).resize(0.5);
				System.out.println("new area: " + s.getArea());
				System.out.println("new perimeter: " + s.getPerimeter()); 
			}
		}
	}
}
