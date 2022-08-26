package ch06.lecture.p02constructor;

public class MyClass01 {
	//필드
	String name;
	
	//생성자 constructor
	//생성자가 하는일 : 인스턴스 생성시 초기화 하는일

	//생성자명 = 클래스명 
	//() : 파라미터 목록
	//{} : 실행코드
	
	public MyClass01() {
		System.out.println("파라미터 없는 생성자 실행됨");
	}
	//생성자는 파라미터 타입, 갯수, 순서를 구분해서 여러개 만들수있음 : 생성자 오버로딩
	public MyClass01(String n) {
		System.out.println("String 파라미터 있는 생성자 실행됨");
		name = n;
	}
	
}
