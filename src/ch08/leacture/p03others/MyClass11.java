package ch08.leacture.p03others;

public class MyClass11 implements MyInterface1{

	@Override
	public void method1() {
		System.out.println("MyClass11 method1");
	}
	
	@Override
	//디폴트 메소드 필요하면 오버라이드 할수있다. 필요하면,
	public void method2() {
		MyInterface1.super.method2(); //인터페이스메소드 호출하려면 꼭. 해주야함 .
	}
	

}
