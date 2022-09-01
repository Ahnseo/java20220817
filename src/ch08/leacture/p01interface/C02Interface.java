package ch08.leacture.p01interface;

import java.io.Serializable;

public class C02Interface {
	public static void main(String[] args) {
		String s1 = "ahn";
		
		/**클래스 Object */
		Object o2 = s1; // 형변환 되고,
		
		/**인터페이스 Serializable */
		Serializable o3 = s1; // 형변환 되고,
		
		/**인터페이스 CharSequence */
		CharSequence o4 = s1; // 형변환 되고,
		
		/**인터페이스 Comparable */
		Comparable<String> o5 = s1; // 형변환 되고,
		
		System.out.println(o3 instanceof Object);
		System.out.println(o3 instanceof Serializable);
		System.out.println(o3 instanceof CharSequence);
		System.out.println(o3 instanceof Comparable);
	}
}
