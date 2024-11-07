package com.javaex.oop.goods.v4;

// this
// this -> 현재 인스턴스 자체를 지칭
// this(...) -> 현재 클래스 내부의 다른 생성자를 지칭
class Goods {
	private String name;
	private int price;
	
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(String name, int price) {
//		this.name = name;
		this(name);
		this.price = price;
	}
	
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
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("John", 400_000);	
		camera.showInfo();
		
		Goods gram = new Goods("LG그램", 900_000);
		Goods mugcup = new Goods("머그컵", 2000);
		gram.showInfo();
		mugcup.showInfo();
	}

}
