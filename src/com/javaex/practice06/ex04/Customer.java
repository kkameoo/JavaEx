package com.javaex.practice06.ex04;

public class Customer extends User {
	private int point;
	
	public Customer(String id, String password, String name, int point) {
		// TODO Auto-generated constructor stub
		super(id, password, name);
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #포인트:%d %n", id, password, name, point );
	}
}