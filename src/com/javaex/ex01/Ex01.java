package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		 
		DisitThread d = new DisitThread();
		d.start();
		
		for(char ch ='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(500);
		}

	}

}
