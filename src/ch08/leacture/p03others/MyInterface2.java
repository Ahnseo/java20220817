package ch08.leacture.p03others;

public interface MyInterface2 {
	void method1(); //추상메소드
	
	//디폴드메소드 여러게
	default void method2() { 
		commenMethod();
		System.out.println("메소드2 내용들");
	}
	default void method3() {
		commenMethod();
		System.out.println("메소드2 내용들");
	}

	private void commenMethod() {
		System.out.println("공통 코드들....");
	}
}
