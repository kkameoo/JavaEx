package com.javaex.basic.decisions;

import java.util.Scanner;

public class IfDecisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ifEx();
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
	
}
