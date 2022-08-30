package ch06.lecture.p07accessmodifier.package01;

import ch06.lecture.p07accessmodifier.package01.MyClass01;
	
public class C01AccessModifier {
	public static void main(String[] args) {
		MyClass01 c1 = new MyClass01();
		c1.name = "coyote";
		c1.printName();
		
		c1.age = 99;
		c1.printAge();
		
		// private 멤버는 같은 패키지여도 사용 불가능(즉 클래스 내에서만 사용가능)
//		o1.secret = "my secret"; 
		c1.setSecret("my secret");
		c1.printSecret();
		
		String s = "java";		
	}
}
