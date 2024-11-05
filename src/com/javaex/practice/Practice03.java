package com.javaex.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex06();
//		ex07();
//		ex09();
//		ex10();
//		ex11();
//		ex12();
//		ex13();
//		ex14();
//		ex15();
		ex16();
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
		scanner.close();
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
	
	private static void ex10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1;
		int num2 = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			num1 = scanner.nextInt();
			if (num1 > num2) {
				num2 = num1;
			}
		}
		System.out.println("최대값은 " +num2+"입니다.");
		scanner.close();
	}
	
	private static void ex11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int sum = 0;
		
		if (num%2 == 0) {
			for(int i = 1; i <= num; i++) {
				if (i%2 == 0) {
					sum += i;
				}
			}
		} else {
			for(int i = 1; i <= num; i++) {
				if (i%2 != 0) {
					sum += i;
				}
			}
		}
		System.out.println("결과값: " + sum);
		scanner.close();
	}
	
	private static void ex12() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int sum = 1;
		
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println("결과값: "+ sum);
		scanner.close();
	}
	
	private static void ex13() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("합계: "+ sum);
		scanner.close();
	}
	
	private static void ex14() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int sum = 0;
		int i = 1;
		
		while (true) {
			sum += i;
			System.out.print(i);
			if (i == num) {
				break;
			}
			System.out.print("+");
			i++;
		}
		
		System.out.println();
		System.out.println("합계: "+ sum);
		scanner.close();
	}
	
	private static void ex15() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++ ) {
			if (num%i == 0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}
	
	private static void ex16() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int count = 0;
		int sum = 0;
	
		for (int i = 1; i <= num; i++) {
			if (i%5 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("5의배수의 개수: " + count);
		System.out.println("5의배수의 합 : " + sum);
		scanner.close();
	}
	
	

}
