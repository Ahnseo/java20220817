package ch10.lecture.p01exception;

public class C01ArithmeticException {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		if(b!=0) {
			
			int c = a/b; //exception 처리를  if문으로 할수도... 
			System.out.println(c);
		}
		
		System.out.println("프로그램종료");
	}
}
