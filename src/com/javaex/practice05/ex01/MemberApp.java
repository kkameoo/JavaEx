package com.javaex.practice05.ex01;

public class MemberApp {
	public static void main(String[] args) {
		Member h1 = new Member();
		Member h2 = new Member();
		Member h3 = new Member();
		
		h1.setId("jws");
		h1.setName("정우석");
		h1.setPoint(50000);
		
		h2.setId("yjs");
		h2.setName("유재석");
		h2.setPoint(30000);
		
		h3.setId("lhr");
		h3.setName("이효리");
		h3.setPoint(40000);
		
		h1.showInfo();
		h2.showInfo();
		h3.showInfo();
		
	}
}
