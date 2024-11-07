package com.javaex.types;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point a = new Point(2, 3);
//		Point b = new Point(2, 3);
//		System.out.println( a == b );
//		System.out.println( a.equals( b ) );
//		String s1 = new String("hello");
//		String s2 = new String("hello");
//		System.out.println( s1 == s2 );
//		System.out.println( s1.equals( s2 ) );
//		System.out.println( a == b );
//		System.out.println( a.equals( b ) );
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double c = a + b;
		System.out.println(c);
		scanner.close();
	}
}
