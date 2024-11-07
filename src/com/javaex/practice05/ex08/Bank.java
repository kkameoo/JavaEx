package com.javaex.practice05.ex08;

import java.util.Iterator;
import java.util.Scanner;

public class Bank {
	private int price;
	
	public void input(int money) {
		this.price += money;
	}
	
	public void output(int money) {
		this.price -= money;
	}
	
	public void balance() {
		System.out.println("잔고액>" + this.price);
	}
	
	
}
