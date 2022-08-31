package ch07.lecture.p02polymorphism;

import java.util.Scanner;

class MyClass1 {
	public String s1;  //자식 타입 String
	public Scanner s2; //자식 타입 Scanner 
	public Object s3; //부모 타입 Object
}

public class C03PolyMorphism {
	public static void main(String[] args) {
		Object o1 = "java";         //(Object class > String class)
		Object o2 = new Scanner("");//(Object class > Scanner class)
		
		method1("hello");           //Parameter (String class = String class)
		method2(new Object());      //Parameter (Object class = Object class)
		method2("coyote");          //Parameter (Object class > String class)
		method2(new Scanner(""));   //Parameter (Object class > Scanner class)
		
		MyClass1 o3 = new MyClass1();
		//instance 초기화
		o3.s1 = "maverick";
		o3.s2 = new Scanner("");
		o3.s3 = new Object();
		
		o3.s3 = "phoenix";       //Parameter (Object class > String class)
		o3.s3 = new Scanner(""); //Parameter (Object class > Scanner class)
	}
	
	public static void method1(String s) {
		
	}
	
	public static void method2(Object s) {
		
	}
}
