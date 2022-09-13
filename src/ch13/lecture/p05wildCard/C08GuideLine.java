package ch13.lecture.p05wildCard;

import java.util.ArrayList;

public class C08GuideLine {
	public static void main(String[] args) {
		//외우는 방법
		//Produce => extends
		//Consume => super
		
		//g"e"t => "e"xtends
		//p"u"t => s"u"per
		
		//in => extends
		//out => super
	}
	
	public static void method1(ArrayList<? extends Number> list) { //extends: get 얻다. 값을받다..꺼내다
		Number n1 = list.get(0);//ok
//		list.add(3); // put 이건 안되지. 
	}
	public static void method2(ArrayList<? super Number> list) { //super: put 넣다. 값을 입력.
//		Number n1 = list.get(0); //get 이건 안되고,
		list.add(3);//ok
	}
	
}
