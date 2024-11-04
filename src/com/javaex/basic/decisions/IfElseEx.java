package com.javaex.basic.decisions;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		codeMaker();
//		switchEx();
//		switchEx2();
		switchPractice();
	}
	
	private static void codeMaker() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		int num = scanner.nextInt();
		
		if(num == 1) {
			System.out.println("R101호 입니다.");
		} else if (num == 2) {
			System.out.println("R202호 입니다.");
		} else if (num == 3) {
			System.out.println("R303호 입니다.");
		} else if (num == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		scanner.close();
	}
	
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		int num = scanner.nextInt();
		
		switch (num) {
		
		case 1: {		
			System.out.println("R101호 입니다.");
			break;
		}
		case 2: {
			System.out.println("R202호 입니다.");
			break;
		}
		case 3: {
			System.out.println("R303호 입니다.");
			break;
		}
		case 4: {
			System.out.println("R404호 입니다.");
			break;
		}
		default:
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		scanner.close();
	}
	
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int num = scanner.nextInt();
		switch (num) {
			case 1, 3, 5, 7, 8, 10, 12 :
				System.out.println("31일");
				break;
			case 4, 6, 9, 11 :
				System.out.println("30일");
				break;
			case 2 :
				System.out.println("28일");
				break;
			default:
				System.out.println("정확한 월을 입력하세요.");
				break;
		}
	}
	
	private static void switchPractice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일을 입력하세요.");
		String week =scanner.nextLine();
		
		switch (week) {
			case "SUNDAY" :
				System.out.println("휴식");
				break;
			case "MONDAY", "TUESDAY", "WEDENSDAY", "THURSDAY" :
				System.out.println("열공");
		    	break;
		    case "FRIDAY" :
		    	System.out.println("불금");
		    	break;
		    case "SATURDAY" :
		    	System.out.println("주말");
		    	break;
		    default :
		    	System.out.println("규격에 맞게 입력하시오.");
		    	break;
		}
		scanner.close();
	}
	
}