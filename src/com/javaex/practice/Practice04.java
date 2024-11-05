package com.javaex.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
//		ex06();
//		ex07();
		ex08();
	}
	
	private static void ex01() {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			result += intArray[i];
		}
		System.out.println(result);
	}
	
	private static void ex02() {
		Double a[] = { 1.2, 3.3, 6.7};
		
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
	
	private static void ex03() {
		int intA[] = {3, 6, 9}, intB[];
		intB = intA; 
		intB[0] = 20;
		intB[2] = 10;
		
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
	}
	
	private static void ex04() {
		int data[] = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int count = 0;
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			if(data[i]%3 == 0) {
				count++;
				sum += data[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);
	}
	
	private static void ex05() {
		Scanner scanner = new Scanner(System.in);
		Double result = 0.0;
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			result += num;
		}
		Double avg = result / 5;
		System.out.printf("평균은 %.1f입니다." , avg);
		scanner.close();
	}
	
	private static void ex06() {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] =',';
			}
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
	
	private static void ex07() {
		Scanner scanner = new Scanner(System.in);
		int wonArray[] = new int[10];
		int count[] = new int[20];
		
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액: ");
		int price = scanner.nextInt();
		
		for (int i = 0; i < wonArray.length; i++) {
			count[i] = price / wonArray[i];
			price %= wonArray[i];
			System.out.println(wonArray[i]+"원:"+count[i]+"개");
		}
		scanner.close();
	}
	
	private static void ex08() {
		int a[] = new int[50];
		for(int i = 1; i <= 45; i++) {
			a[i] = i;
		}
		int prev = 0;
		int now;
//		int count = 0;
		for (int i = 0; i < 6; i++) {
			
			while (true) {
				now = (int)(Math.random()*45) + 1;
//				count++;
				if (now != prev) {
					prev = now;
					break;
				}
			}
			System.out.printf(a[now] + "\t");
		}
//		System.out.println(count);
	}
	
}
