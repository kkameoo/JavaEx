package com.javaex.oop;

public class MethodEx {

	// 메서드 작성 연습
	public static void main(String[] args) {
		printMessage();
		String message = getMessage();
		String message2 = "매개 변수 o, 리턴 x";
		String message3 = "매개 변수 o, 리턴 o";
		System.out.println(message);
		setMessage(message2);
		System.out.println(printMessage(message3));
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
