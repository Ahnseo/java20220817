package ch08.leacture.p03others;

public interface MyInterface1 {
	//public 생략해도 됨
	void method1();  //public method1
	
	//default 메소드 ,여러개 만들어도 됨
	//public 생략해도 됨
	default void method2() { //default method2
		//바디가 있는 메소드 만들고 싶을때 사용.
		System.out.println("MyInterface1 default method2 코드들..");
	} 
	
	//public 생략해도 됨
	//static 메소드 ,여러개 만들어도 됨
	static void method3() {
		//인스턴스 생성없이 사용가능
		System.out.println("MyInterface1 static method3 코드들..");
	}
	
}
