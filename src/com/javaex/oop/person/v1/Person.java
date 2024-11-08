package com.javaex.oop.person.v1;

public class Person {
	protected String name;
	protected int age;
	
	public Person() {
		System.out.println("Person() 생성자 호출");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String, Int) 생성자 호출");
	}
	
	//Getters / Setters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("Name : " + name + " Age : " + age);
	}
}
