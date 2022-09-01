package ch08.leacture.p01interface;

/**
 * abstract      + implements  : 추상클래스를 인터페이스에 상속
 * abstract 없이   implements  : 그냥 인터페이스 상속
 * 
 * */
public class MyClass4 implements MyInterface3{

	@Override
	public void method1() {
		System.out.println("myclass4 method1");
	}

	@Override
	public void method2() {
		System.out.println("myclass4 method2");
	}

	@Override
	public void method3() {
		System.out.println("myclass4 method3");
	}

	@Override
	public void method4() {
		System.out.println("myclass4 method4");
	}
	// MyInterface3 구현
	
}
