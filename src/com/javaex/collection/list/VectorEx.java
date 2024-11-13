package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vector v = new Vector();
		Vector v = new Vector(10);
		System.out.println("Size : " + v.size()
		 + ", Capacity : " + v.capacity());
		
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		
		System.out.println("Size : " + v.size()
		 + ", Capacity : " + v.capacity());
		
		v.addElement(11);
		System.out.println("Size : " + v.size()
		 + ", Capacity : " + v.capacity());
		// 용량의 자동 증가
		
		// 중간에 값을 삽입
		System.out.println(v);
		v.insertElementAt(12, 7);
		System.out.println(v);
		
		// 객체 조회
		int pos = v.indexOf(12);
		System.out.println("12의 인덱스 : "+pos);
		
		int val = (Integer)v.elementAt(pos);
		System.out.println(val);
		
		// 내용을 하나씩 불러와서 출력
		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.printf(item + "\t");
		}
		 // 포함여부
		System.out.println();
		System.out.println("10을 포함? " + v.contains(10));
		
		//삭제
		v.removeElement(10);
		System.out.println(v);
		
		// 버퍼 비우기
		v.clear();
		System.out.println(v);
		System.out.println("size = " + v.size() + ", Capacity = " + v.capacity());
		// capacity는 그대로 유지
		
		//Generic 활용
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement(new String("Java")); -> String은 에러
		
		System.out.println(v2);
		
		v2.addElement(20);
		v2.addElement(30);
		v2.addElement(40);
		// 효율적인 순회를 위해 Enumeration 객체를 제공
		
		System.out.println("===== Enumeration");
		
		Enumeration<? super Number> e =  v2.elements();
		
		while (e.hasMoreElements()) { // 뒤에 요소가 더 있는가?
//			Number item = e.nextElement();
			System.out.println(e.nextElement());
			
		}
		
	}

}
