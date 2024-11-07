package com.javaex.oop.goods.v3;

//코드에 생성자가 만들어져있지 않으면 jvm이 기본 생성자를 끼워 넣는다.
// 개발자가 생성자를 만들면 jvm은 기본 생성자를 끼워 넣지 않는다
class Goods {
	private String name;
	private int price;
	
	public Goods(String name, int price) {
		this.name = name;
		this.price =price;
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
