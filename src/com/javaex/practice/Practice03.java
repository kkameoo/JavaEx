package com.javaex.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex06();
//		ex07();
		ex09();
	}
	
	private static void ex06() {
		for (int i = 1; i <101; i++) {
			if (i%5 == 0 && i%7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	private static void ex07() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	private static void ex08() {
		for(int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+ "="+(i * j) + "\t");
			}
			System.out.println();
		}
	}
	
	private static void ex09() {
		for(int i = 0; i < 10; i++) {
			for (int j = 1 + i; j < 11 + i; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
	
	

}
