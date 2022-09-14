package ch12.lecture;

//동시에 실행시키고싶을때 크게는 2가지 방법있다. 
//Runnable interface 활용
//class만들고 ,스레드를 상속받아서 활용
//Runnable Interface: 스레드가 할일을 () 안에
import java.awt.Toolkit;
public class C02Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
		
		t1.start();
		t2.start();
	}
}
class Task2 implements Runnable {
	@Override
	public void run() {
		// 소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task1 implements Runnable {
	@Override
	public void run() {
		// 문자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

