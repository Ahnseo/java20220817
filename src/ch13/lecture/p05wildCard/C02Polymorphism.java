package ch13.lecture.p05wildCard;

import java.util.ArrayList;

public class C02Polymorphism {
	//Polymorphism 다형성 
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		
		ArrayList<Object> list2 = list1; //xxx  Object -> String x
		list2.add(new Object()); //안된다. xxx  Object -> String x 강제형변환도 위험하니..wildcard를 써야한다
	}
}
