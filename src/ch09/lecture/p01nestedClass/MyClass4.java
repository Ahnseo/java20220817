package ch09.lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		//lambda expression : LocalClass
		//인터페이스에 추상메소드 딱 1개 라면, 이렇게 할수있다. 
		//클래스 구현, 메소드 시그니처 생략가능
		
		MyInterface4 l = () -> {
			System.out.println("재정의한 메소드");
		};
	}
}

interface MyInterface4{
	void method();
//	void method2(); //x
	
	default void method4() {} //default void method 가 여러개여도 상관은 없고,
	default void method5() {}
	default void method6() {}
	default void method7() {}
}