package com.javaex.practice05.ex07;

import java.util.Iterator;
import java.util.Scanner;

public class Freind {
	private String name;
	private String number;
	private String school;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number =number;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school =school;
	}
	
	public Freind (String name, String number, String school) {
		this.name =name;
		this.number = number;
		this.school = school;
	}
	
	public Freind() {}
	
//	public String[] answer() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("친구를 3명 등록해 주세요");
//		String a[] = new String[5];
//		
//		System.out.print("이름: ");
//		a[0] = scanner.nextLine();
//		System.out.print("핸드폰: ");
//		a[1] = scanner.nextLine();
//		System.out.print("학교: ");
//		a[2] = scanner.nextLine();
//		System.out.println("------------------------------------");
//		scanner.close();
//		return a;
//	}
	
	
}
