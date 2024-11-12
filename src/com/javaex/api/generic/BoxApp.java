package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// integer 박스 생성
		
		IntegerBox iBox = new IntegerBox();
//		iBox.setContent("문자열");
		
		// 어떤 객체든 담을 수 있는 박스를 설계
		ObjectBox intBox = new ObjectBox();
		intBox.setContent(123);
		
		Integer retVal = (Integer)intBox.getContent();
		System.out.println(retVal);
		
		ObjectBox strBox = new ObjectBox();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		// 다운캐스팅을 할시 위험성이 큼
		
		// GenericBox
		// 내부 데이터 타입을 외부에서 객체화 시점에서 결정한다
		GenericBox<String> genericStrBox = new GenericBox<>();
		genericStrBox.setContent("Generic_Box");
//		genericStrBox.setContent(2024); -> 컴파일 타입에서 내부 데이터 타입을 확인 할 수 있음
		System.out.println(genericStrBox.getContent());
		// -> 캐스팅 불필요
	}

}
