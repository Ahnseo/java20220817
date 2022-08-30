package ch07.book.s0706.package2;

import ch07.book.s0706.package1.A;

//상속받은상태
public class D extends A {
	public D() {
		super(); //상위 클래스 생성자 호출  ex) this()
		this.field= "value";
		this.method();
	}
}
