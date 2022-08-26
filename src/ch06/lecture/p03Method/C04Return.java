package ch06.lecture.p03Method;

public class C04Return {
	public static void main(String[] args) {
		MyClass04 c1 = new MyClass04();
		
		c1.method1();
//		int a = c1.method2();
//		System.out.println(a);  //타입이 달라서 안됨
		
		int a = c1.method3();
		System.out.println(a); //변수 치환 가능
		System.out.println(c1.method3());
		
		double b = c1.method3();
		System.out.println(b);
		
		float c = c1.method3();
		System.out.println(c);
		
//		short d = c1.method3(); //2byte 라서 안되나봐.
//		System.out.println(d);
		
		long e = c1.method3();
		System.out.println(e);
		
	}
}
