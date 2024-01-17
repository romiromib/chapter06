package com.javaex.ex01;

public class DisitThread extends Thread {

	//필드
	
	//생성자
	//DigitThread()
	
	//메소드 gs
	
	//메소드 일반
	/*
	public void numPrint() {
		for(int i=0;i<=30;i++) {
			System.out.println(i);
			try {;
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
			
	}
	 */
	
	public void run() {
		for(int i=0; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
	}
	
}
	

