package com.javaex.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// queue 자료형
		// 입력 방향과 출력 방향이 반대
		// 먼저 입력된 데이터가 먼저 출력
		// First Input First Output
		// queue는 인터페이스 , 실체 클래스는 linkedList를 그냥 사용
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
			System.out.println("QUEUE : " + queue);
		}
		
		System.out.println("PEEK : " + queue.peek());
		
		// 인출
		while (!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll());
			System.out.println("QUEUE : " + queue);
			
		}

	}

}
