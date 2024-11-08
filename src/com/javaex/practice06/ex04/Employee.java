package com.javaex.practice06.ex04;

public class Employee extends User {
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #월급:%d %n", id, password, name, salary);
	}

	@Override
	public int getSalary() {
		return salary;
	}

}
