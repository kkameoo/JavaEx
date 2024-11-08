package com.javaex.practice06.ex04;

import java.util.Iterator;

public class UserApp {
	public static void main(String[] arsg) {
		User c1 = new Customer("jws", "j1234", "정우성", 1000);
		User c2 = new Customer("yjs", "y2345", "이효리", 2000);
		User e1 = new Employee("master", "m7788", "운영자", 500);
		
		User arrayU[] = {c1, c2, e1};
		
		for(User el : arrayU) {
			el.showInfo();
		}		
		System.out.println("운영자의 월급은 " + e1.getSalary() +"원 입니다.");
	}
}
