package ch06.lecture.p07accessmodifier.package02;

import ch06.lecture.p07accessmodifier.package01.MyClass01;

public class C02AccessModifier {
	public static void main(String[] args) {
		
	MyClass01 c1 = new MyClass01();
	
//	c1.name = "koo";// 접근지정자 생략해서 다른 패키지에선 사용 불가
//	System.out.println(c1.name);// 접근지정자 없어서 다른 패키지에서 사용 불가
	
	c1.age = 99999; // public 멤버는 다른 패키지에서 사용가능
	c1.printAge(); // public 멤버는 다른 패키지에서 사용 가능
	}
}
