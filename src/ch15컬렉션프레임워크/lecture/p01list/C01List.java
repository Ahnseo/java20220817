package ch15컬렉션프레임워크.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		//List : 순서 있음, 중복 가능
		List<String> list1 = new ArrayList<>();
		
		//element(item)추가 : 안쪽의 객체 추가를 의미
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
//		list1.add(3); //x 타입파라이터 String
		
		//get : element(item) 얻기
		String v0 = list1.get(0);
		String v1 =list1.get(1);
		String v2 =list1.get(2);
//		System.out.println(list1.get(3));//ArrayIndexOutOfBoundsException 주의
		
		System.out.println(v0);
		System.out.println(v1);
		System.out.println(v2);
		
		//size : List의 길이 ( 아이템의 갯수 )
		int len = list1.size();
		System.out.println(len);
		System.out.println("마지막 아이템:"+ list1.get(list1.size()-1));
		
		
		
		
	}
}
