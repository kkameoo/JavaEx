package com.javaex.practice05.ex06;

public class StaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		double dollar;
        double won;
        
        Convert.setRate(1118.70);
        
        won = 1000000;
        dollar = 100;
        
        //100만원을 달러로 출력하기
        
        System.out.println("백만원은 "+Convert.toDoller(won)+"달러입니다.");
        
        //100달려를 원으로 출력하기

        System.out.println("백달러는 "+Convert.toKWR(dollar)+"입니다.");
        
	}

}
