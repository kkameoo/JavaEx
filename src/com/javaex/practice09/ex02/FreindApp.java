package com.javaex.practice09.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FreindApp {

	public static void main(String[] args) {

		System.out.println("친구를 3명 등록해 주세요");
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String c = scanner.nextLine();
		String ifm1[] = a.split(" ");
		String ifm2[] = b.split(" "); 
		String ifm3[] = c.split(" "); 
		Freind f1 = new Freind(ifm1[0], ifm1[1], ifm1[2]);
		Freind f2 = new Freind(ifm2[0], ifm2[1], ifm2[2]);
		Freind f3 = new Freind(ifm3[0], ifm3[1], ifm3[2]);
		
		List<Freind> fList = new ArrayList<>();
		fList.add(f1);
		fList.add(f2);
		fList.add(f3);
		
		for(Freind f : fList) {
			f.showInfo(f.getName(), f.getpNumber(), f.getSchool());
		}
		scanner.close();
	}
}
