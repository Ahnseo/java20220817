package ch08.leacture.p03others;

public class C01DefaultMethod{

	public static void main(String[] args) {
		MyInterface1 o1 = new MyClass11();
		
		o1.method1(); //추상 메소드
		o1.method2(); //디폴트 메소드
		MyInterface1.method3(); //스태틱 메소드
	}
}
