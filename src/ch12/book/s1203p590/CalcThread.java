package ch12.book.s1203p590;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2_000_000_000; i++) {
			//일단 i를 20억번 실행한 프로그램인것을 
			//먼저 끝난 스레드이름을 먼저출력
		}
		System.out.println(getName());
	}
}
