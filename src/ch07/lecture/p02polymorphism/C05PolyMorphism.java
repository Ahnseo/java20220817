package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C05PolyMorphism {
	public static void main(String[] args) {
		//배열선언
		/**String 배열 arr1가 3개의 배열을 갖는 새로운 instance(객체)를 만든다.*/
		String[] arr1 = new String[3]; 
		arr1[0] = "bob";
		
		/**Scanner배열 arr2가 3개의 배열을 갖는 새로운 instance(객체)를 만든다.*/
		Scanner[] arr2 = new Scanner[3];
		arr2[0] = new Scanner("");
		
		/**Object배열 arr3가 3개의 배열을 갖는 새로운 instance(객체)를 만든다.*/
		Object[] arr3 = new Object[3];
		arr3[0] = new Object(); 		// 새로운 Object class 메소드를 ->arr3[0] 에 return
		arr3[1] = new String("iceman"); // 새로운 String class 메소드를 ->arr3[1] 에 return
		arr3[1] = "iceman";				// new String 은 많이쓰여서 생략가능.
		arr3[2] = new Scanner("");		// 새로운 Scanner class 메소드를 ->arr3[2] 에 return
	}
}
