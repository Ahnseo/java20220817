package ch13.lecture.p05wildCard;

import java.util.ArrayList;
import java.util.List;

public class C01Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(); 
		list1.add("ice");
		list1.add("good");
		
	    List<String> list2	= list1;
	    list2.add("mine");
	    list2.add("cool");
	    
	    System.out.println(list2);
	}
}
