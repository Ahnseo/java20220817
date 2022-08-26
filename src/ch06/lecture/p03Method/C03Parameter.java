package ch06.lecture.p03Method;

public class C03Parameter {
	public static void main(String[] args) {
		//메소드 : 리턴타입 메소드명 (파라미터) {코드블록}
		//메소드명: lowerCamelCase
		//파라미터목록: (타입명 파라미터명)을 , 로 구분해서 0개 이상 작성가능
		
		//같은 메소드명이지만, 다른 파라미터 목록으로 여러 메소드 만들수있음.
		MyClass03 c1 = new MyClass03();
		c1.method1();
		c1.method2(3);
		c1.method3("정");
		c1.method4(3, 5);
		c1.method5("안", "서");
		c1.method6(3, "정");
		
		c1.method6();
		c1.method6(7);
		c1.method6("정", 3);
		
		c1.method7(99, "안");
		c1.method7(77, "서");
		
		
	}
}
