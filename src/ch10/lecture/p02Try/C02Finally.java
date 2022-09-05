package ch10.lecture.p02Try;

public class C02Finally {
	public static void main(String[] args) {
		int a = 3; 
		int b = 1;
		
		try {
			//익센션 발생 안해서 실행
			int c = a/b;
			System.out.println("익센션 발생 안해서 실행됨");
			System.out.println(c);
		} catch (ArithmeticException e) {
			// 익셉션 발생하면 실행되는 코드
			System.out.println("익셉션 발생하면 실행되는 코드들..");
		} finally {
			// 익셉션 발생여부 관계 없이 실행되는 코드
			System.out.println("익셉션 발생여부 관계 없이 실행..");
		}
		System.out.println("실행흐름 계속 이어감");
	}
}
