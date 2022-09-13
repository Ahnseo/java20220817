package ch13.lecture.p05wildCard;

import java.util.ArrayList;

public class C06UpperBoundedWildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(6);
		
		ArrayList<? super Integer> list2 = list1;
		list2.add(9);
		
		//UpperBounded WildCard , Integer의 하위 타입이어야. (Integer 포함)
		ArrayList<? extends Integer> list3 = list1;
		int v1 = list3.get(0);
		
		ArrayList<? extends Number> list4 = list1;  
		Integer v2 = list4.get(0); //x  Number class > Integer class
		
	}
}
