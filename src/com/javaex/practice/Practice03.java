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
//		ex16();
//		ex17();
//		ex18();
//		ex19();
//		ex20();
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
	
	private static void ex17() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
	
	private static void ex18() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
	
	private static void ex19() {
		Scanner scanner = new Scanner(System.in);
		
		int price = 0;
		boolean flag = false;
		
		while (true) {
			if (flag == true) {
				break;
			}
			
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num = scanner.nextInt();
			
			switch (num) {
			
			case 1: {
				System.out.print("예금액>");
				int rPrice = scanner.nextInt();
				price += rPrice;
				System.out.println();
				break;
			}
			case 2: {
				System.out.print("출금액>");
				int wPrice = scanner.nextInt();
				price -= wPrice;
				System.out.println();
				break;
			}
			case 3: {
				System.out.print("잔고액>" + price);
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				flag = true;
				break;
			}
			default:
				System.out.println("다시입력해주세요");
				break;
			}
		}
	}
	
	private static void ex20() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		
		while (true) {
			System.out.println("==============================");
			System.out.println("       [숫자맞추기게임 시작]       ");
			System.out.println("==============================");
			int correct = (int)(Math.random()*100)+ 1;
			System.out.println("정답"+correct);
			int num = 0;
			
			while (true) {
				System.out.print(">>");
				num = scanner.nextInt();
				if (num == correct) {
					
					System.out.println("맞았습니다.");
					System.out.println("게임을 종료하시겠습니까?(y/n) >>");
					char ans = scanner.next().charAt(0);
					if(ans == 'y') {
						System.out.println("==============================");
						System.out.println("       [숫자맞추기게임 종료]       ");
						System.out.println("==============================");
						flag = true;
						break;
					} else if (ans == 'n') {
						break;
					} else {
						System.out.println("정확한 입력을 하시오");
					}
					
				} else if(num < correct) {
					System.out.println("더 높게");
				} else if (num > correct) {
					System.out.println("더 낮게");
				}
			}
			if (flag == true) {
				break;
			}
			
		}
		scanner.close();
	}
}
