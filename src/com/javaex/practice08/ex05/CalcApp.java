package com.javaex.practice08.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String numline = scanner.nextLine();
			if (numline == "/q") {
				System.out.println("종료합니다.");
				break;
			}
			
			String num[] = numline.split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[2]);
			
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