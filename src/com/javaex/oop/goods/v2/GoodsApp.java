package com.javaex.oop.goods.v2;

// Goods v2, 접근제한자
class Goods {
	// 필드 선언
	private String name;
	private int price;
	
	// Getters / Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.printf("가격 : %,d%n", price);
	}
}
// Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		// 생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		camera.setName("John");
		camera.setPrice(400_000);
		
//		System.out.printf(" %s -> %,d%n ", camera.getName() , camera.getPrice());
		camera.showInfo();
		
		Goods gram = new Goods();
		Goods mugcup = new Goods();
		gram.setName("LG그램");
		gram.setPrice(900_000);
		mugcup.setName("머그컵");
		mugcup.setPrice(2000);
//		System.out.printf("상품이름: %s, 가격: %,d%n ", gram.getName() , gram.getPrice());
//		System.out.printf("상품이름: %s, 가격: %,d%n ", mugcup.getName() , mugcup.getPrice());
		gram.showInfo();
		mugcup.showInfo();
	}

}
