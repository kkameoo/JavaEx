package com.javaex.basic.opers;

public class ArithOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arithBasic();
		increOpers();
	}
	
	private static void increOpers() {
		
		int a = 7;
		System.out.println("a:" + a);
		System.out.println("++a:" + ++a);
		System.out.println("a++:" + a++);
		System.out.println("final a:" + a);
		
	}

	private static void arithBasic() {
		// 기초 산술 연산자
		int a = 7, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a % b);
		System.out.println(a / b);
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
	}
}