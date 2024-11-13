package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new Hashtable<>();
		
		// map에 데이터 추가 및 변경 : put
		map.put("10,홍길동", new Student(10, "홍길동"));
		map.put("20,홍길동", new Student(20, "홍길동"));
		map.put("30,고길동", new Student(30, "고길동"));
		map.put("30,고길동", new Student(30, "고길동2"));
		
	
		System.out.println(map);
		
		// 맵 데이터 가져오기 : get
		System.out.println(map.get("30,고길동"));
		
		// 툭정 키 포함 여부
		System.out.println(map.containsKey("30,고길동"));
		
		// iterator
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			Student st = map.get(it.next());
			System.out.println(st);
		}
	}
}