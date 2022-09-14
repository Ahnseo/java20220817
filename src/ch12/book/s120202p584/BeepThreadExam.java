package ch12.book.s120202p584;

public class BeepThreadExam {
	public static void main(String[] args) {
		Thread thread = new BeepThread(); //BeepThread클레스는 Thread를 상속받고있음.
		
		thread.start(); //BeepThread 클래스 객체 실행과 아래 메인메소드 ~띵 실행 
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("~띵");
				thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
