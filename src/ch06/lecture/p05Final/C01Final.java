package ch06.lecture.p05Final;

public class C01Final {
	public static void main(String[] args) {
		// 책 (645)
		// final : 변수에 값을 한 번만 할당할 수 있다
		
		int a = 3;
		a = 5;
		
		final int b;
		b = 9;
//		b = 10; //xx
		
		method1(30);
		method2(33);
		method2(44);
	
	static void method1(int i) {
		i = 3;
	}
	
	static void method2(final int i) {
//		i = 5; // xx
		//메소드 호출할떄, user가 입력한 파라미터 딱 1번만 입력되도록 함.
	}
}