package com.javaex.basic.reftypes;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingArray();
//		multiDimArrayEx();
//		arrayCopyForEx();
//		arrayCopySystem();
		enhancedFor();
		
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
	
	private static void arrayCopyForEx() {
		//배열 크기 변경 - 배열 생성 복사
		int source[] = {1, 2, 3};
		
		int target[] = new int[10];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		System.out.println("복사본:" + Arrays.toString(target));
	}
	
	private static void arrayCopySystem() {
		// 더 쉬운 방법
		int[] source = {1, 2, 3};
		System.out.println("원본 + " + Arrays.toString(source));
		
		int[] target = new int[10];
		System.arraycopy(source, 0, target, 0, source.length);
		// 원본 배열, 시작인덱스, 타겟 배열, 타겟 배열의 시작인덱스, 복사할 길이
		System.out.println("복사본 : " + Arrays.toString(target));
	}
	
	private static void enhancedFor() {
		// 일반적인 for문
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		for (int num: nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
	}
		
}
