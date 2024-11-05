package com.javaex.basic.reftypes;

import java.util.Iterator;
import java.util.Scanner;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingEnum();
		switchEnumPractice();
	}
	
	private static void usingEnum() {
		Week today = Week.TUESDAY;
		
		// 열거 상수  -> String
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		String dayStr = "FRIDAY";
		// String -> 열거상수 Convert
		
		Week obj = Week.valueOf(dayStr);
		System.out.printf(obj.name() + " " + obj.ordinal()+"\n");
		
		// 열거 상수 목록
		Week obj2[] = Week.values();
		System.out.println(obj2);
		for (int i = 0; i < 7; i++) {
			System.out.println(obj2[i]);
		}
		
		// compareTo : 두 객체 사이의 순서를 비교하는 메서드
		Week otherDay = Week.FRIDAY;
		// TUESDAY 와 FRIDAY 비교
		System.out.println(today.compareTo(otherDay));
	}

	private static void switchEnumPractice() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("요일을 입력하세요.");
//		String week =scanner.nextLine();
		
		Week day = Week.TUESDAY;
		
		switch (day) {
			case SUNDAY :
				System.out.println("휴식");
				break;
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY :
				System.out.println("열공");
		    	break;
		    case FRIDAY :
		    	System.out.println("불금");
		    	break;
		    case SATURDAY :
		    	System.out.println("주말");
		    	break;
		    default :
		    	System.out.println("규격에 맞게 입력하시오.");
		    	break;
		}
//		scanner.close();
		
	}
}
