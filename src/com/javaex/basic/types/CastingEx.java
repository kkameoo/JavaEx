package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testPromotion();
		testCasting();
	}

	private static void testCasting() {
		byte b;
		int i = 2024;
		float f = 123.456f;
		
		b = (byte)i;
		System.out.println(i);
		System.out.println(b);
		
		// 실수 -> 정수
		i = (int)f;
		System.out.println(i);
	}
	
	private static void testPromotion() {

		byte b = 25;
		System.out.println(b);

		short s = b;
		System.out.println(s);

		int i = s;
		System.out.println(i);

		long l = i;
		System.out.println(l);

		float f = l;
		System.out.println(f);

		double d = f;
		System.out.println(d);

		char ch = 'A';
		short s2 = (short) ch;
		System.out.println(s2);

	}

}
