package ch09.lecture.p02lambda;

public class MyClass2 {
	public static void main(String[] args) {
		//중괄호 생략 가능
		MyInterface2 o1 = () -> System.out.println("중괄호 생략가능하다~");
		o1.method1();
	}
}
@FunctionalInterface
interface MyInterface2{
	void method1();
}
