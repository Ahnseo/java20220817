package ch10.lecture.p02Try;

public class C03Finally {
	public static void main(String[] args) {
		
		try {
			int a = 3/3;
			if(a == 1) {
				return;  //3/3 == 1 이면 , try문 종료, 하지만 finally문은 무조건 실행함
			}
			
		} catch (ArithmeticException e) {
			System.out.println("Exception");
		} finally {
			System.out.println("@@@ Finally");
		}
		System.out.println("continues ...");
	}
}
