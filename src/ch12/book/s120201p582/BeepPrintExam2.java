package ch12.book.s120201p582;

import java.awt.Toolkit;

public class BeepPrintExam2 {
	public static void main(String[] args) {
		//Runnable 인터페이스를 만들고,
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i <5; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
