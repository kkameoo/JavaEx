package com.javaex.practice09.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public Goods() {
	}
	
	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public void showInfo() {
		System.out.printf("%s(가격:%d원)이 %d 개 입고 되었습니다.%n", name, price, count);
	}
}
