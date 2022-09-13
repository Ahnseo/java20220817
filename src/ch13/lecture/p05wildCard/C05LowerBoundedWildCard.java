package ch13.lecture.p05wildCard;

import java.util.ArrayList;

public class C05LowerBoundedWildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Number> list2 = new ArrayList<>();
		ArrayList<Object> list3 = new ArrayList<>();
		
		setItems(list1);
		setItems(list2);
		setItems(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
			
	}
	//ArrayList<? super Integer> : 와일드카드 적용, 상위타입을 결정해줌, 어쨋거나 필요할때가 있음.
	//Integer, Double, Byte, Short, ... String 등등  응용할수있음.
	// ? : LowerBounded WildCard
	public static void setItems(ArrayList<? super Integer> list) {
		list.add(3);
		list.add(6);
		list.add(9);
	}
}
