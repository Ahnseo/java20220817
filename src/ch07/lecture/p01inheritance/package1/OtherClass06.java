package ch07.lecture.p01inheritance.package1;

public class OtherClass06 {
	public void someMethod() {
		SuperClass06 o1 = new SuperClass06();
//		o1.privateMethod(); //x private 으로 제한된 메소드
		o1.packagePrivateMethod(); // ok, default 로 제한된 메소드
		o1.protectedMethod(); // ok    default < protected < public 
		o1.publicMethod(); // ok
	}
}
