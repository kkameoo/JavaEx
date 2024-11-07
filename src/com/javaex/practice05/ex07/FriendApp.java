package com.javaex.practice05.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		String a[] = new String[5];
		
		System.out.print("이름: ");
		a[0] = scanner.nextLine();
		System.out.print("핸드폰: ");
		a[1] = scanner.nextLine();
		System.out.print("학교: ");
		a[2] = scanner.nextLine();
		System.out.println("------------------------------------");
		
		Freind h1 = new Freind(a[0], a[1], a[2]);
		
		System.out.print("이름: ");
		a[0] = scanner.nextLine();
		System.out.print("핸드폰: ");
		a[1] = scanner.nextLine();
		System.out.print("학교: ");
		a[2] = scanner.nextLine();
		System.out.println("------------------------------------");
	
		Freind h2 = new Freind(a[0], a[1], a[2]);
		
		System.out.print("이름: ");
		a[0] = scanner.nextLine();
		System.out.print("핸드폰: ");
		a[1] = scanner.nextLine();
		System.out.print("학교: ");
		a[2] = scanner.nextLine();
		System.out.println("------------------------------------");
		
		
		Freind h3 = new Freind(a[0], a[1], a[2]);
		
		System.out.printf("이름:%s  핸드폰:%s  학교:%s%n", h1.getName(), h1.getNumber(), h1.getSchool());
		System.out.printf("이름:%s  핸드폰:%s  학교:%s%n", h2.getName(), h2.getNumber(), h2.getSchool());
		System.out.printf("이름:%s  핸드폰:%s  학교:%s%n", h3.getName(), h3.getNumber(), h3.getSchool());
		scanner.close();
		
	}

}
