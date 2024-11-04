package com.javaex.basic.decisions;

import java.util.Scanner;

public class IfDecisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ifEx2();
	}
	
	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		scanner.close();
	}
	
	private static void ifEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		
		if (num == 0) { 
		   System.out.println("0 입니다. ");
		} else {
			if(num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		scanner.close();
	}
}