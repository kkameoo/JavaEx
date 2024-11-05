package com.javaex.basic.reftypes;

import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingArray();
		
	}
	
	private static void usingArray() {
		
		String[] names; //Type[] 식별자
		int scores[]; //Type 식별자[]
		
		names = new String[] {"김", "이", "박", "최"}; // 초기값이 있을 때
		
		scores = new int[4]; // 빈 배열 만들기
		// 인덱스 접근
		// 0부터 시작
		// .length - 1 까지
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		
		float heights[] = { 175.3f, 170.2f, 173.4f, 168.9f }; // 선언과 동시에 할 때
		
		for (int i = 0; i < 4; i++) {
			System.out.printf(" %s씨 는 %d점을 맞았고 %f 키를 가진다.%n", names[i],scores[i],heights[i] );
		}
		
	} 
}
