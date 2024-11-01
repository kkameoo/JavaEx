package com.javaex.basic.opers;

public class LogicalOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7, b = 3;
		
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);
	
		int val = -2;
		
		if (val <= 0 || val >= 10) {
			System.out.println("트루");
		} else {
			System.out.println("거짓");
		}
		
		
	}
}