package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 첫 번째 인스턴스가 생성되기전에 class 먼저 메모리에 로드
		// static 블록에서 스태틱 영역 초기화 -  > 생성자 초기화
		
			StaticEx s1 = new StaticEx(); // 객체생성
			System.out.println("refCount : " + StaticEx.refCount); // static 영역이므로 new로 생성할 필요 x
			StaticEx s2 = new StaticEx();
			System.out.println("refCount : " + StaticEx.refCount); 
			
			s1 = null; // 참조 해제
			System.gc(); // 가비지 컬렉터 호출 -> 직접 호출은 지양하자
			try {
				Thread.sleep(3000);
				System.out.println("refCount : " + StaticEx.refCount);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
	}

}
