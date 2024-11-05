package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingString();
		stringFormatEx();
	}
	
	private static void usingString() {
		String str;
		str = "JAVA";
		String str2 = "JAVA";
		String str3 = new String("JAVA");
		
		// ==는 참조 주소를 비교
		System.out.println(str == str2);
		System.out.println(str == str3);
		
		// 객체의 경우, 값의 비교는 equals 메서드
		System.out.println(str.equals(str3));
	}
	
	private static void stringFormatEx() {
		int total = 10, eat =3;
		String fruit = "사과";
		System.out.println(total + "개의 " + fruit + " 중에 " + eat + "개를 먹었다");
		
		// -> formatting
		System.out.printf("%d개의 %s 중에 %d개를 먹었다%n", total, fruit, eat);
		
		// String.format 메서드 활용한 것
		String template = "%d개의 %s 중에 %d개를 먹었다";
		System.out.println(String.format(template, 10, "사과", 5));
		
		System.out.println(String.format(template, 5, "바나나", 2));
		
		// 천단위에 , 포메팅
		int amount = 123_456_789;
		System.out.printf("현재 잔고는: %d입니다.%n", amount);
		System.out.printf("현재 잔고는: %,d입니다.%n", amount);
		
		// %f . 으로 소수점 조정 가능
		float interestRate = 1.2345f;
		System.out.printf("현재 이자율은 %f입니다.%n", interestRate);
		System.out.printf("현재 이자율은 %.2f입니다.%n", interestRate);
	}
	
	

}
