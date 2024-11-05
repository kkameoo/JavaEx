package com.javaex.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex06();
//		ex07();
//		ex08();
//		ex09();
//		ex10();
//		ex11();
//		ex12();
//		ex13();
//		ex14();
//		ex15();
//		ex16();
//		ex17();
//		ex18();
//		ex20();
//		ex22();
		ex23();

	}
	
	private static void ex06() {
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		Scanner scanner = new Scanner(System.in);
		int age =scanner.nextInt();
		
		if (age >= 19 && age < 65) {
			System.out.println("1번 그룹 입니다.");
		} else {
			System.out.println("2번 그룹 입니다.");
		}
		scanner.close();
	}
	
	private static void ex07() {
		System.out.println("나이를 입력해주세요.");
		System.out.printf("나이: ");
		Scanner scanner = new Scanner(System.in);
		int age =scanner.nextInt();
		
		if (age >= 0 && age <= 7) {
			System.out.println("취학전아동//무료입니다.");
		} else if (age >= 8 && age <= 13) {
			System.out.println("초등학생//2000원 입니다.");
		} else if (age >= 14 && age <= 16) {
			System.out.println("중학생//3000원 입니다.");
		} else if (age >= 17 && age <= 19) {
			System.out.println("고등학생//4000원 입니다.");
		} else {
			System.out.println("성인/5000원 입니다.");
		}
		scanner.close();
	}
	
	private static void ex08() {
		System.out.println("키와 몸무게를 입력해 주십시오.");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("키:");
		double height = scanner.nextInt();
		System.out.printf("몸무게:");
		double weight = scanner.nextInt();
		
		double bmi;
		bmi = weight / (height * height / 10000);
		System.out.printf("%.15f" ,bmi);
		scanner.close();
	}
	
	private static void ex09() {
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.printf("년도: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int age = 2024 - year;
		if (age > 15 && age <= 65) {
			System.out.println(age + "살 무료예방접종 대상자 입니다");
		} else {
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다");
		}
		scanner.close();
	}
	
	private static void ex10() {
		System.out.println("숫자2개를 입력해주세요");
		System.out.printf("숫자1: ");
		Scanner scanner = new Scanner(System.in);
		int num1 =scanner.nextInt();
		System.out.printf("숫자2: ");
		int num2 =scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수: " + num1 + "\t\t 작은수: " + num2 + "입니다.");
		} else {
			System.out.println("큰수: " + num2 + "\t\t 작은수: " + num1 + "입니다.");
		}
		scanner.close();
	}
	
	private static void ex11() {
		System.out.printf("첫번째 숫자: ");
		Scanner scanner = new Scanner(System.in);
		int num1 =scanner.nextInt();
		System.out.printf("두번째 숫자: ");
		int num2 =scanner.nextInt();
		
		int division;
		int moduler;
		
		if (num1 > num2) {
			division = num1 / num2;
			moduler = num1 % num2;
			System.out.println("몫: " + division);
			System.out.println("나머지: " + moduler);
		} else {
			division = num2 / num1;
			moduler = num2 % num1;
			System.out.println("몫: " + division);
			System.out.println("나머지: " + moduler);
		}
		scanner.close();
	}
	
	private static void ex12() {
		System.out.println("숫자 3개를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자1: ");
		int num1 =scanner.nextInt();
		System.out.printf("숫자2: ");
		int num2 =scanner.nextInt();
		System.out.printf("숫자3: ");
		int num3 =scanner.nextInt();
		
		if (num1 < num2) {
			if (num1 <num3) {
				System.out.println("가장 작은수는 " + num1 + " 입니다." );
			} else {
				System.out.println("가장 작은수는 " + num3 + " 입니다." );
			}
		} else if (num1 > num2){
			if (num2 < num3) {
				System.out.println("가장 작은수는 " + num2 + " 입니다." );
			} else {
				System.out.println("가장 작은수는 " + num3 + " 입니다." );
			}
		}
		scanner.close();
		// 리팩토링 필요
	}
	
	private static void ex13() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫번째 숫자: ");
		int num1 =scanner.nextInt();
		System.out.printf("두번째 숫자: ");
		int num2 =scanner.nextInt();
		
		if (num1 > num2) {
			if (num1 % num2 == 0) {
				System.out.println(num2 + " 는(은) " + num1 + " 의 약수입니다." );
			} else {
				System.out.println(num2 + " 는(은) " + num1 + " 의 약수가 아닙니다." );
			}
		} else {
			if (num2 % num1 == 0) {
				System.out.println(num1 + " 는(은) " + num2 + " 의 약수입니다." );
			} else {
				System.out.println(num1 + " 는(은) " + num2 + " 의 약수가 아닙니다." );
			}
		}
		scanner.close();
	}
	
	private static void ex14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.printf("사번: ");
		int num =scanner.nextInt();
		
		int teamNum = num % 3;
		
		switch (teamNum) {
			case 0: {
				System.out.println("A팀입니다.");
				break;
			}
			case 1: {
				System.out.println("B팀입니다.");
				break;
			}
			case 2: {
				System.out.println("C팀입니다.");
				break;
			}
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
		}
		scanner.close();
	}
	
	private static void ex15() {
		System.out.println("출력되는 내용을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("기호: ");
		String sign =scanner.nextLine();
		System.out.printf("숫자1: ");
		double num1 =scanner.nextInt();
		System.out.printf("숫자2: ");
		double num2 =scanner.nextInt();
		double result;
		
		switch (sign) {
		case "+": {
			result = num1 + num2;
			System.out.printf("결과는: %.1f", result);
			break;
		}
		case "-": {
			result =  num1 - num2;
			System.out.printf("결과는: %.1f", result);
			break;
		}
		case "*": {
			result =  num1 * num2;
			System.out.printf("결과는: %.1f", result);
			break;
		}
		case "/": {
			if (num2 == 0) {
				System.out.println("계산할 수 없습니다.");
				break;
			}
			result =  num1 / num2;
			System.out.printf("결과는: %.1f", result);
			break;
		}
		default:
			System.out.println("계산할 수 없는 기호입니다.");
			break;
		}
		scanner.close();
	}
	
	private static void ex16() {
		System.out.println("숫자를 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자: ");
		double num =scanner.nextInt();
		double result;
		if (num <= 0) {
			result = (num*num*num) - (9*num) + 2;
		} else {
			result = 7 * num + 2;
		}
		System.out.printf("계산결과는 %.1f 입니다.", result);
		scanner.close();
	}
	
	private static void ex17() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double price = scanner.nextInt();
		double result;
		
		if (price >= 0 && price <= 1000 ) {
			result = 0.09 * price;
			System.out.printf("소득세는 %.1f 입니다.", result);
		} else if (price > 1000 && price <= 4000) {
			result = 1000*0.09 + 0.18*(price - 1000);
			System.out.printf("소득세는 %.1f 입니다.", result);
		} else if (price > 4000 && price < 8000) {
			result = 1000*0.09 + 3000*0.18 + 0.27*(price - 4000);
			System.out.printf("소득세는 %.1f 입니다.", result);
		} else if (price >= 8000){
			result = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(price - 8000);
			System.out.printf("소득세는 %.1f 입니다.", result);
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		scanner.close();
	}
	
	private static void ex18() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char alphabet = scanner.next().charAt(0);
		
		switch (alphabet) {
			case 'a', 'e', 'i', 'o', 'u' : {
				System.out.println("모음입니다.");
				break;
			}
			default : 
				System.out.println("자음입니다.");
				break;
		}
		scanner.close();	
	}
	
	private static void ex20() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char alphabet = scanner.next().charAt(0);
		
		if ( alphabet == 'a' || alphabet == 'e' ||  alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			System.out.println("모음입니다.");
		} else {
			System.out.println("자음입니다.");
		}
		scanner.close();
	}
	
	private static void ex22() {
		System.out.println("숫자 3개를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자1: ");
		int num1 =scanner.nextInt();
		System.out.printf("숫자2: ");
		int num2 =scanner.nextInt();
		System.out.printf("숫자3: ");
		int num3 =scanner.nextInt();
		int smallest;
		
		smallest =  num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		System.out.println("가장 작은수는 " + smallest + " 입니다.");
		
		scanner.close();
		// 리팩토링 완료
		
	}
	
	private static void ex23() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year = scanner.nextInt();
		int age = 2024 - year;
		System.out.println("올해:2024");
		System.out.println("태어난해:" + year);
		System.out.println("나이:" + age);
		System.out.println("===================================");
		
		if (age < 20) {
			System.out.println("20살미만 건강검진대상이 아님");
		} else {
			System.out.println("20살 이상");
			if (year % 2 == 0) {
				System.out.println("건강검진해");
			} else{
				System.out.println("건강검진해 아님");
			}
			
			if (age >= 40) {
				System.out.println("암 검사");
			} else {
				System.out.println("암 검사X");
			}
		}
		scanner.close();
	}
	
}