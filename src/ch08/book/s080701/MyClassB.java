package ch08.book.s080701;

public class MyClassB implements MyInterface{
	@Override
	public void method1() {
		System.out.println("MyClassB - method1 실행");
		
		
	}
	
	//인터페이스의 디폴트 메소드는 오버라이드 해도됨
	@Override
	public void method2() {
		System.out.println("MyClassB - method2 실행");
		MyInterface.super.method2(); 
	}
}
