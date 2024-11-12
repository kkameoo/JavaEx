package com.javaex.practice08.ex05;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String num[] = numLine.split(" ");
		System.out.println(Arrays.toString(num));
		
		for (String a : num) {
			sum += Integer.valueOf(a);
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}
}