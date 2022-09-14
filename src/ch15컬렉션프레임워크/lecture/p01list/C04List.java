package ch15컬렉션프레임워크.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C04List {
	public static void main(String[] args) {
	//List : 순서가 있다. (중복된 아이템도 넣을수 있기 때문에 , 순서가 있다.)
		
	List<String> list = new ArrayList<String>();
	list.add("aaa");
	list.add("bbb");
	list.add("ccc");
	list.add(null);
	list.add(null);
	list.add("ddd");
	
	System.out.println(list);
	
	}
}
