package com.javaex.basic.reftypes;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingArray();
		multiDimArrayEx();
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
		
		int scores2[] = scores; // 참조 복제 -> 객체의 주소를 가르키는 것
		
		System.out.println("scores:" + Arrays.toString(scores));
		System.out.println("scores2:" + Arrays.toString(scores2));
		System.out.println(scores == scores2);
		scores2[2] = 100;
		System.out.println("scores:" + Arrays.toString(scores)); // 원본 값이 바뀜
		
	}
	
	private static void multiDimArrayEx() {
		int[][] twoDimens = new int[5][10];
		
		// 기본 데이터가 있을 경우
		int table[][] = {
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 
				{1, 2, 3, 4, 5, 6, 7, 8, 9 ,0}, 
				{2, 3, 4, 5, 6, 7, 8, 9, 0 ,1}, 
				{3, 4, 5, 6, 7, 8, 9, 0, 1 ,2}, 
				{4, 5, 6, 7, 8, 9, 0, 1, 2 ,3}
		};
		
		System.out.println("table.length : " + table.length);
		System.out.println("table.0.length : " + table[0].length);
		
		// table 배열 내부의 모든 요소의 합을 구하자
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
