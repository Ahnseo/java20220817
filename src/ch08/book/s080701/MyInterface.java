package ch08.book.s080701;

public interface MyInterface {
	void method1();
	
	default void method2() {
		System.out.println("Interface - method2 실행");
	}

}