package com.javaex;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleOutput();
	}
	
	public static void ConsoleOutput() {
		System.out.print("Hello \"");
		System.out.println("\tJAVA!");
		System.out.println("\\JAVA!");
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		System.out.println(value);
		scanner.close();
		//
	}
}
