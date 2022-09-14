package ch12.book.exercise.p2;

public class ThreadExam {
	//확인문제 빈칸의 코드를 채우세요
	
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread( new MusicRunnable() );
		thread2.start();
		
	}
}

class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MovieThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
