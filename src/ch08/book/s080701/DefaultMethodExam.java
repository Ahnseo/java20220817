package ch08.book.s080701;

import ch08.leacture.p01interface.MyInterface1;

public class DefaultMethodExam {
	public static void main(String[] args) {
		
		MyInterface m1 = new MyCLassA();
		
		m1.method1();
		m1.method2();
		
		System.out.println();
		
		MyInterface m2 = new MyClassB();
		
		m2.method1();
		m2.method2();
	}
}
