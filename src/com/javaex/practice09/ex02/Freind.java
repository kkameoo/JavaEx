package com.javaex.practice09.ex02;

import java.util.List;

public class Freind {

	private String name;
	private String pNumber;
	private String school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public Freind() {
	}
	
	
	public Freind(String name, String pNumber, String school) {
		super();
		this.name = name;
		this.pNumber = pNumber;
		this.school = school;
	}
	
	public void showInfo(String name, String pNumber, String school) {
		
		System.out.printf("이름:%s 핸드폰:%s 학교:%s%n", name, pNumber, school);
		
	}
	
	
}
