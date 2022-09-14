package ch15컬렉션프레임워크.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		//리스트 만드는 방법1
		List<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("css");
		list1.add("spring");
		System.out.println(list1);
		System.out.println();
		
		//리스트 만드는 방법2
		List<String> list2 = Arrays.asList("java","css","html");
		System.out.println(list2);
		System.out.println();
		
		//리스트 만드는 방법3
		List<String> list3 = List.of("java","css","JSP");
		System.out.println(list3);
		System.out.println();
		
		//주의 2,3 은 추가/제거 불가능...........
		list1.add("ahn");
//		list2.add("seo");
//		list3.add("jung");
		System.out.println(list1);
		
		//주의 3은 변경도 불가능
		list1.set(0, "ahn");
		list2.set(0, "ahn");
//		list3.set(0, "ahn");
		System.out.println(list1);
		System.out.println(list2);
		
		
	}
}
