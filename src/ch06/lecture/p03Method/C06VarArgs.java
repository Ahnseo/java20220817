package ch06.lecture.p03Method;

public class C06VarArgs {
	//스태틱메소드 main..
	public static void main(String[] args) {
		// VarArge :   static void method1(int... i) {  }
		// 가변인자 (Variable argument)
		// 가변인자는 파라미터 목록 끝에만 작성가능
		// 메소드 내에 배열로 사용!
		

		
		method1();
		method1(3);
		method1(3,4,5,6,7,8);
		
	}

	private static void method1() {
		System.out.println("파라미터 없는 메소드");		
	}
	private static void method1(int a) {
		System.out.println("파라미터 하나 받는 메소드");
	}
	
	//같은 타입을 여러개 받을 경우 (몇개인지 모름)
	private static void method1(int... i) {
		System.out.println("파라미터 여러개 받는 메소드");	
		System.out.println("i.length: " + i.length);
		System.out.println("i[0]: " + i[0]); //배열 이됨
		System.out.println("i[1]: " + i[1]);
	}
	
	
	private static void method1(String s, int... i) {
		System.out.println("파라미터 속 가변인자입력은 마지막에");	
	}
	private static void method1(int... i, String s) {
		System.out.println(" 파라미터 오류, 불가능 ");	
	}
}
