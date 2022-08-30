package ch07.lecture.p01inheritance;

public class C02Expends {
	public static void main(String[] args) {
		SubClass03 c1 = new SubClass03();
		c1.method1();
		c1.method2();
		c1.method3();
		
		SuperClass03 c2 = new SuperClass03();
		
		c2.method1();
		c2.method2();
		
	}
}
