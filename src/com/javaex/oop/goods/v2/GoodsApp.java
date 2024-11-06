package com.javaex.oop.goods.v2;

// Goods v2, 접근제한자
class Goods {
	// 필드 선언
//	private 
	String name;
//	private 
	int price;
}
// Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		// 생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		camera.name = "John";
		camera.price = 400_000;
		
		System.out.printf(" %s -> %,d%n ", camera.name , camera.price);
		
		Goods gram = new Goods();
		Goods mugcup = new Goods();
		gram.name = "LG그램";
		gram.price = 900_000;
		mugcup.name = "머그컵";
		mugcup.price = 2000;
		System.out.printf("상품이름: %s, 가격: %,d%n ", gram.name , gram.price);
		System.out.printf("상품이름: %s, 가격: %,d%n ", mugcup.name , mugcup.price);
		
	}

}
