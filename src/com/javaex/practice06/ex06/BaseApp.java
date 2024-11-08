package com.javaex.practice06.ex06;

import java.util.Iterator;

public class BaseApp {
	public static void main(String[] args) {
		
		Base base = new MyBase();
		base.service("낮");
		base.service("밤");
		base.service("오후");
	}
}
