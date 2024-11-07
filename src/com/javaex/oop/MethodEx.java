package com.javaex.oop;

import java.util.Iterator;

public class MethodEx {

	// 메서드 작성 연습
	public static void main(String[] args) {
//		printMessage();
//		String message = getMessage();
//		String message2 = "매개 변수 o, 리턴 x";
//		String message3 = "매개 변수 o, 리턴 o";
//		System.out.println(message);
//		setMessage(message2);
//		System.out.println(printMessage(message3));
		
		// 매개변수 개수를 알 수 없을때 해결방법
		// 방법1, 배열을 전달한다
		System.out.println("getSumArr : " + getSumArr(new double[] { 1, 2, 3, 4, 5, 6, 7, 8}));
		// 방법2, 가변 인수를 적용
		System.out.println("getSumVar : " + getSumVar(1, 2, 3, 4, 5, 6, 7, 8));
	}
	
	private static double getSumVar(double ... values) {
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		return total;
	}
	
	private static double getSumArr(double[] values) {
		double total = 0;
		
		for (int i = 0; i < values.length; ++i) {
			total += values[i];
		}
		
		return total;
	}
	
	private static void printMessage() {
		System.out.println("매개 변수 x, 리턴 x");
	}
	
	private static String getMessage() {
		return "매개 변수 x, 리턴 o";
	}
	
	private static void setMessage(String a) {
		System.out.println(a);
	}
	
	// 오버로딩
	private static String printMessage(String a) {
		return a;
	}
}
