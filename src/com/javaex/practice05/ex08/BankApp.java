package com.javaex.practice05.ex08;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Bank h1 = new Bank();
		boolean flag = false;
		
		while (true) {
			
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			int num = scanner.nextInt();
			switch (num) {
				case 1: {
					System.out.print("예금액>");
					int rPrice = scanner.nextInt();
					h1.input(rPrice);
					break;
				}
				case 2: {
					System.out.print("출금액>");
					int rPrice = scanner.nextInt();
					h1.output(rPrice);
					break;
				}
				case 3: {
					h1.balance();
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
			if (flag == true) {
				break;
			}
		}
	scanner.close();
	}

}
