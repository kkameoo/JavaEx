package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stack
		// 가장 마지막에 입려된 자료가 먼저 출력된다
		// Last Input - First Output : 후입선출 자료형
		Stack<Integer> stack = new Stack<>();
		
		//값을 10개 push
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
			System.out.println(stack);
		}
		
		// 출력 방향의 데이터 확인
		System.out.println("PEEK : " + stack.peek()); // 확인
		System.out.println("STACK : " + stack);
		
		// 인출 : 입력 방향과 동일
		System.out.println("POP : " + stack.pop());
		System.out.println("STACK : " + stack);
		
		while (!stack.empty()) {
			System.out.println("POP : " + stack.pop());
			System.out.println("STACK : " + stack);
		}
		
	}

}
