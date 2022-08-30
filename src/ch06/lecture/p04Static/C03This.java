package ch06.lecture.p04Static;

public class C03This {
	public static void main(String[] args) {
		MyClass03 c1 = new MyClass03("maverick");
		System.out.println(c1.name);
		c1.printName(); // maverick

		
		MyClass03 c2 = new MyClass03("bob");
		System.out.println(c2.name);
		c2.printName(); // bob

		
		System.out.println(MyClass03.company);
		System.out.println(c1.company);
	}
}
