package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float floatVar = 3.14159F;
		double doubleVar = 3.14159;
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);	
		
		// e 표기법
		int intVar = 3000000;
		doubleVar = 3E6; // 3* 10 ^ 6
		floatVar = 3e-6F; // 3 * 10 ^ -6
		
		System.out.println("intVar : " + intVar);
		System.out.println("doubleVar : " + doubleVar);
		System.out.println("floatVar : " + floatVar);
		
		// 부동소수점 처리 유의사항
		System.out.println(0.1 * 3);
	}
}