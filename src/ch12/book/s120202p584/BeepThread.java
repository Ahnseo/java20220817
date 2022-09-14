package ch12.book.s120202p584;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		try {
			toolkit.beep();
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
