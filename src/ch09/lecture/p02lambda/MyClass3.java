package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		
	MyInterface3 o1 = (String s) -> System.out.println(s);
	o1.method1("hello");
	o1.method1("java");
	
	//() 에 s 만써도 됨
	MyInterface3 o2 =(s) -> System.out.println(s.repeat(2)); 
	o2.method1("top");  
	o2.method1("gun");
	
	//()생략 , s 만 써도됨
	MyInterface3 o3 =s -> System.out.println(s.repeat(2));
	o2.method1("coyote");
	o2.method1("bob");
	
	
	}
}
@FunctionalInterface
interface MyInterface3 {
	void method1(String s);
}
