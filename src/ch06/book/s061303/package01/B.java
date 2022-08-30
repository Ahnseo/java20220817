package ch06.book.s061303.package01;

public class B {
	//필드와 메소드의 접근제한
	
	/**다른파일의 A 클래스 참조중.. */
	/**public field*/
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1; //x
		
		a.method1();
		a.method2();
		a.method3();//x
	}


}
