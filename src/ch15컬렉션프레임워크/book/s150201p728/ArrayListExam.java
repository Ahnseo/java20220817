package ch15컬렉션프레임워크.book.s150201p728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("list의 총개수:"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+ skill);
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			String string = list.get(i);
			System.out.println(i + " : "+string);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			System.out.println(i + " : " + string);
		}
	}
}
