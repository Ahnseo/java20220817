package ch07.lecture.p01inheritance.package2;

//다른패키지라서 import붙음
import ch07.lecture.p01inheritance.package1.SuperClass06;

//상속시키면, protected 참조가능
public class SubClass06 extends SuperClass06 {
	public void someMethod() {
		super.privateMethod();//x
		super.packagePrivateMethod();//x
		super.protectedMethod();//o protected 상속가능하게됨.
		super.publicMethod();//o
	}
}
