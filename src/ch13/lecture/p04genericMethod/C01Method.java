package ch13.lecture.p04genericMethod;

public class C01Method {
	public static void main(String[] args) {
		C01Method.<String>method1("스트링을 넣고싶다면, 메소드앞에 타입파라미터<String>");
		C01Method.<Integer>method1(33);
		C01Method.<Double>method1(3.14);
		
		//메소드 타입 파라미터 생략가능!!! 99.9% 이렇게 사용
		method1("스트링이니까 추론이 가능해서,메소드앞에 타입파라미터 안씀 ㅋㅋ");
		method1(33);
		method1(3.14);
	}
	
	//genericMethod, 메소드 안에 제네릭을 쓸수있음
	
//	public static void method(Object o) {
//
//	}
//	public static void method(String o) {
//
//	}
//	public static void method(Integer o) {
//
//	}
	
	public static <T> void method1(T o) {
		
	}
	
		
	
}
