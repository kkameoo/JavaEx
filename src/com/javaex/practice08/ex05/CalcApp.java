package com.javaex.practice08.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String numline = scanner.nextLine();		
			String num[] = numline.split(" ");
			int a = 0;
			int b = 0;
			
			try {
				a = Integer.parseInt(num[0]);
				b = Integer.parseInt(num[2]);
			} catch (Exception e) {
				if (numline.equals("/q")) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println("잘못된 입력, 종료합니다.");
				break;
				// TODO: handle exception
			}
				
			switch (num[1]) {
			case "+": {
				Add add = new Add();
				System.out.println(">> " + add.calculate(a, b));
				break;
			}
			case "-": {
				Sub sub = new Sub();
				System.out.println(">> " + sub.calculate(a, b));
				break;
			}
			case "*": {
				Mul mul = new Mul();
				System.out.println(">> " + mul.calculate(a, b));
				break;
			}
			case "/": {
				Div div = new Div();
				System.out.println(">> " + div.calculate(a, b));
				break;
			}
			default:
				System.out.println("알 수 없는 연산입니다.");
				break;
			}
		}
	}
}