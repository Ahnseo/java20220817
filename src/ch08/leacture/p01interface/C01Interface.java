package ch08.leacture.p01interface;

public class C01Interface {
	public static void main(String[] args) {
		
		 
		/** class MyClass1 implements MyInterface1  
		 * 인터페이스 멤버 : 상수와 메소드만 갖는다
		 * 
		 * 이전의 배운 class 상속과 같은 기능을 한다
		 * 하지만, 인터페이스는 여러게 구현 가능하다.
		 * 
		 * */
		MyClass1 o1 = new MyClass1();
		MyInterface1 o2 = o1;
		
		
		/** class MyClass2 implements MyInterface1 , MyInterface2
		 * 인터페이스는 여러게 붙일수있다
		 * */
		MyClass2 o3 = new MyClass2();
		MyInterface1 o4 = o3;
		MyInterface2 o5 = o3;
		
	}
}
