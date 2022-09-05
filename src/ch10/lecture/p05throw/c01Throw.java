package ch10.lecture.p05throw;

public class c01Throw {
	public static void main(String[] args) {
		method1();
		
		System.out.println("프로그램 실행이어감");
		
	}

	private static void method1() {
		System.out.println("코드1");	
		System.out.println("코드2");
		//예외발생 , throw Exception
		throw new RuntimeException();
	}
}
