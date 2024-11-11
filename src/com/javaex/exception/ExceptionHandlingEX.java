package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithExceptionEx();
	}
	
	private static void arithExceptionEx() {
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		
		// 예외 발생 가능 영역
		try {
			num  = scanner.nextInt();
			result = 100 / num;
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해 주세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
		scanner.close();
		
	}

}
