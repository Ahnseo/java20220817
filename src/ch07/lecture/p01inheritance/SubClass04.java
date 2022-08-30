package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04//상속 {

	//상위클래스 메소드 재정의(Override) 가능
	@Override // 컴파일러에게 재정의(Override) 메소드 인지 점검받는 annotation
	public void method1() {
		System.out.println("subclas04 method1 재정의(오버라이드)");
	}
	
	public void method2() {
		System.out.println("subclass04 method2");
	}
	
	@Override
	public void method3() {
		System.out.println("subclass04 method3 재정의(오버라이드)");
	}
}
