package ch06.lecture.p04Static;

public class C02StaticBlock {
	public static void main(String[] args) {
		MyClass02 c1 = new MyClass02("maverick");
		System.out.println(c1.name);
		
		System.out.println(MyClass02.company);
		System.out.println(MyClass02.rank);
	}
}