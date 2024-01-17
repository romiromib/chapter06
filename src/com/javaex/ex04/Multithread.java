package com.javaex.ex04;

public class Multithread {

	public static void main(String[] args) {
		
		Thread t01 = new Thread(new DigitImpl());
		Thread t02 = new Thread(new LowerImpl());
		Thread t03 = new Thread(new UpperImpl());
		
		t01.start();
		t02.start();
		t03.start();
		

	}

}
