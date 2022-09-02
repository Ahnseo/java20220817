package ch09.lecture.p02lambda;

public class MyClass1 {
	public static void main(String[] args) {
		MyInterface1 o1 = () -> {
			System.out.println("자바가. 클래스안에 인터페이스 1개의 메소드를 이미 알고있으니, 가능하다.");
		};
		o1.method1();
	}
}
// ** Functional interface :  추상 메소드가 1개 인 인터페이스
//재정의할 매소드 1개 (추상메소드1개)
//람다식 가능
@FunctionalInterface //@FunctionalInterface 검증하기
interface MyInterface1 {
	void method1();
}
