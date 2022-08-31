package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C02PolyMorphism {
	public static void main(String[] args) {
		//다형성, 자동형변환
		String s1 = "java"; // String은 String
		Object s2 = "hello"; //Object 속에 String
		
//		String s3 = s2; // x 반대는안됨, (Object class > String class)
		
		Scanner scanner = new Scanner(""); //scanner는  scanner
		Object s4 = scanner;               //Object class > Scanner Class)
		Object s5 = new Scanner("hello");  //Object class > Scanner Class)
		
	}
}
