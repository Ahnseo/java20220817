package ch12.lecture;

import java.awt.Toolkit;

public class C03ThreadRambda {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for (int i = 0; i < 5; i++) {
				try {
					toolkit.beep();
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println("띵");
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start(); //Thread 클래스의 start메소드
		t2.start();
		
	}
}
