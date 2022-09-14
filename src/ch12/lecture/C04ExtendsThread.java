package ch12.lecture;

import java.awt.Toolkit;

public class C04ExtendsThread {
	public static void main(String[] args) {
		Thread string = new Thread(new Task4());
		Thread sound = new Thread(new Task3());
		string.start();
		sound.start();
	}
}

class Task4 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("띵");
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		};
	}
}

class Task3 extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			try {
				toolkit.beep();
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}

