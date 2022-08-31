package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C04PolyMorphism {
	public static void main(String[] args) {
		
	}
	
	public static String method1() {
		
		return "";
	}
	public static Scanner method2() {
		
		return new Scanner("");
	}
	
	public static Object method3() {
		
		return new Object();
	}
	
	public static Object method4() {
		
		return "";
	}
	
	public static Object method5() {
		Scanner s = new Scanner("");
			
		return s;				  // 참조타입{ (Object class > Scanner class) }
	}
	public static Object method6() {
		
		return new Scanner("");   // 참조타입{ (Object class > Scanner class) }
	}
	
	
	public static Object method7() {
		String s = "java";
		return s;                 // 참조타입{ (Object class > String class) }
	}
	
}
