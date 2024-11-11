package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			stringBasic();
//			usefulMethod();
			stringBufferEx();
	}
	
	private static void stringBasic() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 메모리에 새로 만들기
		String s3;
		s3 = "Java"; // 리터럴
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// 문자열 배열로 string 생성
		
		char[] letters = {'J', 'a', 'v', 'a', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', '!'};
		String s4 = new String(letters);
		System.out.println(s4);
		System.out.println(s4.length());
		
		// valueof 메서드
		// -> 다른 데이터타입을 문자열로 변환하는 메서드
		float PI = 3.14159f;
		String s5 = String.valueOf(PI);
		System.out.println(s5);
	}
	
	private static void usefulMethod() {
		String str = "Java Programming, JavaScript Programming";
		
		// 문자열의 길이
		System.out.println(str.length());
		
		// 변환 메서드
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//검색 관련 메서드
		System.out.println(str.charAt(5));
		
		// Java가 어느 인덱스에 있는가
		int pos = str.indexOf("Java");
		System.out.println("1st search Java : " + pos);
		pos = str.indexOf("Java", pos + 4);
		System.out.println("2st search Java : " + pos);
		pos = str.indexOf("Java", pos + 4);
		System.out.println("3rd search Java : " + pos);
		// 검색한 부분문자열이 없으면 -1을 반환
		
		pos = str.lastIndexOf("Java");
		System.out.println("Last Index Java : " + pos);
		
		//문자열 추출
		System.out.println("SUBSTRING : " + str.substring(5));
		System.out.println("SUBSTRING : " + str.substring(5 ,16));
		
		// 문자열 치환
		System.out.println("REPLACE : " + str.replace("Programming", "Coding"));
		
		// trimming : 화이트 스페이스를 제거하는 메서드
		String s6 = "			Hello			";
		String s7 = ", Java";
		s6 = s6.trim();
		System.out.println(s6 + s7);
		
		// 문자열 분리 : split()
		String[] tokens = str.replace(",", "").split(" ");
		System.out.println("SPLIT : " + Arrays.toString(tokens));
		
		// 문자열 비교 : Unicode
		// compareTo (매우 중요)
		// -> 0이면 순번이 같다, 값이 작으면 음수, 값이 크면 양수
		System.out.println("ABC".compareTo("ABD"));
	}
	
	private static void stringBufferEx() {
		// string 클래스는 immutable
		// stringBuffer 클래스는 mutable
		// 내부적으로 버퍼를 통해서 문자열을 만들고 최종적으로 string을 반환
		
		StringBuffer sb = new StringBuffer("this");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		sb.setLength(10);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(7, " my")
				.replace(7, 10, " your");
		String s = sb.toString(); //문자열로 변환
		System.out.println(s);
	}
}