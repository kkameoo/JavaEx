package com.javaex.practice07.ex02;

public abstract class Bird {
	protected String name;
	
	public Bird() {
	}
	
	public Bird(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//	public abstract String getName();
//	
//	public abstract void setName(String name);

	public abstract void sing();
	
	public abstract void fly();
	
	public abstract void showName();
}

