package com.javaex.basic.opers;

public class CondOperEx {
	
	public static void main(String[] args) {
		
		int a = 11;
		boolean b;
		
		b = a % 2 == 0 ? true : false;
		
		System.out.println(b);
		
		String message;
		int score = 70;
		
		message = (score >= 80) ? "Good":
			(score >= 50) ? "pass" : "fail";
		System.out.println(message);
	}
}
