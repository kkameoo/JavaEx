package com.javaex.practice05.ex07;

import java.util.Iterator;
import java.util.Scanner;

public class Freind {
	private String name;
	private String number;
	private String school;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number =number;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school =school;
	}
	
	public Freind (String name, String number, String school) {
		this.name =name;
		this.number = number;
		this.school = school;
	}
	
	public Freind() {}

}
