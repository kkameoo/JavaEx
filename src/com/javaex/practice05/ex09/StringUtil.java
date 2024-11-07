package com.javaex.practice05.ex09;

import java.util.Iterator;
import java.util.Scanner;

public class StringUtil {
	 public static String concatString(String[] arrayEx){
		 	String result = "";
	        for (String element :arrayEx) {
	        	
	        	result += element;
	        }
	        return result;
	    }
}
