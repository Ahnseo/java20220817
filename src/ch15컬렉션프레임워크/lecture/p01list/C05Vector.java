package ch15컬렉션프레임워크.lecture.p01list;

import java.util.List;
import java.util.Vector;

public class C05Vector {
	public static void main(String[] args) {
		//Vector가 ArrayList보다 먼저 개발되었지만, 
		//왠만하면, ArrayList를 추천
		List<String> list = new Vector<String>();
		list.add("aaa");
		list.add("bbb");
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(0);
		
		list.add("ccc");
		System.out.println(list);
		
	}
}
