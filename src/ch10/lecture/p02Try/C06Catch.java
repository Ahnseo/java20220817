package ch10.lecture.p02Try;

public class C06Catch {
	public static void main(String[] args) {
		try {
			int a = 3/ 0;
			
		} catch (Throwable e) { //ArithmeticException,RuntimeException,Exception,Throwable 
								// 근데 뭘써도 상관있을떄가 있음
			System.out.println("0으로 나누려고?");
		}
	}
}
