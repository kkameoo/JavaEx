package com.javaex.api.arrays;

import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {
		// Java Arrays의 search는 기본적으로 binarySearch 알고리즘을 사용
		// 기본 타입 검색
//		basicSearch();
		
		customSearch();
		
	}
	
	private static void basicSearch() {
		int[] nums = { 5, 7, 3, 1, 2, 4, 6, 8, 9, 10 };
		System.out.println("원본 : " + Arrays.toString(nums));
		
		Arrays.sort(nums);
		System.out.println("원본 정렬 : " + Arrays.toString(nums));
		int index = Arrays.binarySearch(nums, 7);
		System.out.println("7의 인덱스 : " + index);
		
		String[] str = { "Java", "C", "C++", "Python", "Linux"};
		Arrays.sort(str);
		System.out.println("원본 정렬 : " + Arrays.toString(str));
		int index2 = Arrays.binarySearch(str, "Python");
		System.out.println("Python의 인덱스 : " + index2);
	}
	
	private static void customSearch() {
		Member m1 = new Member("고길동");
		Member m2 = new Member("홍길동");
		Member m3 = new Member("장길산");
		Member m4 = new Member("임꺽정");
		
		Member[] members = {m1, m2, m3, m4};
		System.out.println("원본 : " + Arrays.toString(members));
		
		Arrays.sort(members);
		System.out.println("원본 정렬 : " + Arrays.toString(members));
		int index = Arrays.binarySearch(members, new Member("장길산"));
		System.out.println("장길산의 인덱스 : " + index);
	}

}
