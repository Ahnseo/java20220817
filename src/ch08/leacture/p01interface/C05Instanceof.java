package ch08.leacture.p01interface;

import java.io.Serializable;

public class C05Instanceof {
	public static void main(String[] args) {
		
		String s1 = "abcdef";
		System.out.println(s1 instanceof String); //true
		System.out.println(s1 instanceof Object); //true
		System.out.println(s1 instanceof Serializable); //true
		System.out.println(s1 instanceof Comparable<?>); //true
		System.out.println(s1 instanceof CharSequence); //true
//		System.out.println(s1 instanceof StringBuilder); //false
		
	}
}
