package ch09.lecture.p02lambda;

public class MyClass4 {
	public static void main(String[] args) {
		MyInterface4 o1 = (String s, int i) -> System.out.println(s.repeat(i));	
		MyInterface4 o2 = (s, i) -> System.out.println(s.repeat(i));
		
//		MyInterface4 o2 = s, i -> System.out.println(s.repeat(i));  //x
		
		o1.method1("top", 2);
		o2.method1("gun", 3);
	}
}

interface MyInterface4 {
	void method1(String s, int i);
}