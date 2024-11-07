package com.javaex.practice05.ex06;


public class Convert {
	public static double rate;
    
    	public static void setRate(double rate){
    		Convert.rate = rate;
    	}
    
    	public static double toDoller(double won){
    		return won / rate;
    	}

    	public static double toKWR(double dollar){
    		return dollar * rate;
    	}
}
