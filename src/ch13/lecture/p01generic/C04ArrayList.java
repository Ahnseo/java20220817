package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C04ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add("6");
		
		list.get(0); //3 integer
		list.get(1); //6 이라는 스트링
		
		int v1 = (Integer) list.get(0);
		System.out.println(v1);
		int v2 = (Integer) list.get(1);
		System.out.println(v2); //스트링이기때문에 오류
		
		System.out.println("프로그램 종료");
		//그러면 이제 제네릭을 사용해서 ArrayList를 사용하는 방법을 배우자..C05
		
	}
}
