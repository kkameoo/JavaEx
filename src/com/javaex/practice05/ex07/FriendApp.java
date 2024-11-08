package com.javaex.practice05.ex07;

import java.util.Iterator;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] a = name(scanner);
		Freind h1 = new Freind(a[0], a[1], a[2]);
		
		String[] b = name(scanner);
		Freind h2 = new Freind(b[0], b[1], b[2]);
		
		String[] c = name(scanner);
		Freind h3 = new Freind(c[0], c[1], c[2]);
		
		Freind arrayH[] = {h1, h2, h3};
		
		for (Freind h : arrayH) {
			System.out.printf("이름:%s  핸드폰:%s  학교:%s%n", h.getName(), h.getNumber(), h.getSchool());
			
		}
		scanner.close();
	}
	
	private static String[] name(Scanner scanner) {
		System.out.println("친구를 3명 등록해 주세요");
		String a[] = new String[5];
		System.out.print("이름: ");
		a[0] = scanner.nextLine();
		System.out.print("핸드폰: ");
		a[1] = scanner.nextLine();
		System.out.print("학교: ");
		a[2] = scanner.nextLine();
		System.out.println("------------------------------------");
		return a;
	}
}