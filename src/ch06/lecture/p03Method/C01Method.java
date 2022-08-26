package ch06.lecture.p03Method;

public class C01Method {
	public static void main(String[] args) {
		MyClass01 c1 = new MyClass01();
		
		c1.name = "서정";
		c1.age = 30; // (인스턴스) 필드
		
		c1.method(); //인스턴스 메소드 호출 . (인스턴스가 있어야 메소드호출 됨)
		
		System.out.println("메인 메소드 코드 1");
		
		
	}
}
