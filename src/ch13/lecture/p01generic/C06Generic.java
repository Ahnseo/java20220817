package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C06Generic {
	public static void main(String[] args) {
		//타입 파라미터에 기본타입 넣을 수없음
//		ArrayList<int> list = new ArrayList<int>(); //x
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //이렇게 해야함
		list.add(3);
		list.add(6);
		
		int v1 = list.get(0);  //ArrayList<Integer>
		Integer v2 = list.get(1);  //형 변환 없이 안전하게 변수에 담을수있다. 자동 언박싱
		
		System.out.println(v1);
		System.out.println(v2);
		
	}
}
