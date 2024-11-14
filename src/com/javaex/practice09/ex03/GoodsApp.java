package com.javaex.practice09.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품을 입력해주세요(종료 q)");
		int sum = 0;
		List<Goods> gList = new ArrayList<>();
		while (true) {
			String a = scanner.nextLine();
			if (a.equals("q")) {
				break;
			}
			String b[] = a.split(",");
			Goods goods = new Goods(b[0], Integer.valueOf(b[1]) , Integer.valueOf(b[2]));
			gList.add(goods);
		}
		System.out.println("[입력완료]");
		System.out.println("======================");
		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
			sum += gList.get(i).getCount();
		}
		System.out.println("모든 상품의 갯수는"+ sum +"개입니다.");
	}
}
