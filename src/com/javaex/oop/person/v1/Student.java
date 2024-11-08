package com.javaex.oop.person.v1;

public class Student extends Person {
	private String schoolName;
	
	public Student (String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(String) 생성자 호출");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(String, int String) 생성자 호출");
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void getSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Name: " + name + " Age:" + age + " SchoolName:" + schoolName);
	}
}
