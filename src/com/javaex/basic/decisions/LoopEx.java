package com.javaex.basic.decisions;

import java.util.Iterator;
import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		whileEx2();
//		doWhileEx();
		ForEx();
	}
	
	private static void whileEx() {
		int i = 0;
		
		while (true) {
			i++;
			System.out.println(i);
			if (i == 10) {
				System.out.println("stop");
				break;
			}
		}
	}
	
	private static void whileEx2() {
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("8 * " + i + " = " + i * 8 );
//		}
		Scanner scanner = new Scanner(System.in);
		
		int j = scanner.nextInt();
		int i = 0;
		while (i < 9) {
			i++;
			System.out.println(j + " * " + i + " = " + i * j );
		}
		scanner.close();
	}
	
	private static void doWhileEx() {
		int total = 0;
		int value = 0;
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			value = scanner.nextInt();
			total += value;
			System.out.println("함계: " + total);
		} while (value != 0);
	}
	
	private static void  ForEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int j = scanner.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i * j );
		}
		scanner.close();
	}
}
