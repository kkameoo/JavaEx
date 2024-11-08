package com.javaex.practice06.ex06;

public class MyBase extends Base{
	
	public MyBase() {}
		
	@Override
	public void service(String state) {
			
		if (state.equals("낮")) {
			day();
		}  else if(state.equals("밤")) {
			night();
		} else if (state.equals("오후")) {
			afternoon();
		}
	}
		
	@Override
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
		
	@Override
	public void night() {
		System.out.println("밤에는 숙면");
	}
	
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}