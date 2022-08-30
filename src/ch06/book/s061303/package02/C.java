package ch06.book.s061303.package02;

/**다른 패키지의 A 클래스 참조중.. */
import ch06.book.s061303.package01.A;
//import ch06.book.s061303.package01.*;

public class C {
	/**public field*/
	public C () {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; //x
		a.field3 = 1; //x
		
		a.method1();
		a.method2();//x
		a.method3();//x
	}
}
