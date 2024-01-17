package com.javaex.ex02;

public class UpperThread extends Thread {

public void run() {
		
		for(char ch ='ㄱ'; ch<='ㅎ'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
