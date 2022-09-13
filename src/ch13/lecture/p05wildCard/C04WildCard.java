package ch13.lecture.p05wildCard;

import java.util.ArrayList;

public class C04WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(3);
		
		ArrayList<? super Integer> list2 = list1; 
		list2.add(6);//x  , 근데 list2에 int 6을 넣고싶을때, <? super Integer>
	}
}
