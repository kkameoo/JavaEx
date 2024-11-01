package com.javaex.basic.types;

public class IntLongEx {
 public static void main(String[] args) {
	  int intVar1;
	  int intVar2;
	  
	  intVar1 = 2024;
//	  intVar2 = 1234567890123; out of range
	  System.out.println(intVar1);
	  
	  long longVar1 = 2024;
	  long longVar2 = 1234567890123L;
	  
	  System.out.println(longVar2);
	  
	  long amount = 100_000_000L;
	  System.out.println(amount);
	  
	  int bin, oct, hex;
	  bin = 0b1100;
	  oct = 072;
	  hex = 0xFF;
	  
	  System.out.println(bin + " " + oct+ " " + hex);
 }
}
