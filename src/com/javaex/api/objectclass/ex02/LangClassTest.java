package com.javaex.api.objectclass.ex02;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point  p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
		
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
