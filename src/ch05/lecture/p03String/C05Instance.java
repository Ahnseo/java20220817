package ch05.lecture.p03String;

import java.util.Scanner;

public class C05Instance {
	public static void main(String[] args) {
		String s1 ="java"; //스트링은 예외로 new 연산자를 뺌. 많이 써서.
		String s2 = new String ("java");
		
		// new : 주소를 새로 만듬
		//그 주소의 메모리묶음을 instance(객체,개체) 라고함	
//									      객체 : data(값) : 필드
//											 action(기능) : 메소드
		//이 때 객체(String)는 어떤 설계도에 의해 만들어진것
		//설계도 : class
		
		Scanner sc = new Scanner(System.in);
		// 이떄 객체(Scanner)는 어떤 설계도에 의해 만들어짐
		Scanner sc2 = new Scanner("hello");
		
		
	}
}
