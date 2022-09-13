package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C05Generic {
	public static void main(String[] args) {
//		E: type parameter ,<>가진 것을 generic type이라함.
//		type parameter에 String을 넣으면, 이제부터 String 으로 리턴. 
//		예를들어 add(E e) 를  String으로 함.
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
//		list.add(6); //x 
		list.add("6");
		
		String v1 = list.get(0); //이제 형변환없이 안전하게 변수에 담을수있고. 
		String v2 = list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
		
		
		
	}
}
