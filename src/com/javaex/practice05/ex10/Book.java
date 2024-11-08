package com.javaex.practice05.ex10;

public class Book {
	 private int bookNo;
	 private String title;
	 private String author;
	 private int stateCode;
	 
	 public Book(int bookNo, String title, String author) {
		// TODO Auto-generated constructor stub
		 this.bookNo =bookNo;
		 this.title =title;
		 this.author =author;
		 this.stateCode = 1;
	}
	 
	 public int getBookNo() {
		return bookNo;
	}
	 
	 public void setBookNo(int bookNo) {
		this.bookNo =bookNo;
	}
	 
	 public String getTitle() {
			return title;
	}
		 
	 public void setTitle(String title) {
			this.title =title;
	}
		 
	 public String getAuthor() {
			return author;
	}
			 
	 public void setAuthor(String author) {
			this.author =author;
	}
	 
	 public int getStateCode() {
			return stateCode;
	}
	 
	 public void rent(int num) {
		 this.stateCode = 0;
		 System.out.println(this.title + "이(가) 대여 됐습니다.");
	}
	 
	 public void print() {
			String message = "";
			message = this.stateCode == 1 ? "재고있음" : "대여중"; 
	    	System.out.printf("%d 책 제목:%s, 작가:%s, 대여 유무:%s %n",this.getBookNo(), this.getTitle(), this.getAuthor(), message);
	}
	 
}
