package ch12.lecture;

import java.awt.Toolkit;

public class C01Thread {
	//지금까지 메인메소드로 하나의 일이 순서대로 실행되는 것만했음.
	//싱글스레드 singleThread (=mainThread)
	public static void main(String[] args) throws InterruptedException {
		for(int i =0; i<5; i++) {
			System.out.println("띵~");
			Thread.sleep(1000); //1초간격으로 텀을 두기 위해
		}
		//소리 출력
		Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(1000); //1초간격으로 텀을 두기 위해,실행 잠시 1초 멈춤
		}
	}
}
