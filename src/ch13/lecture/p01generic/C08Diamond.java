package ch13.lecture.p01generic;

import java.util.ArrayList;
import java.util.Map;

public class C08Diamond {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>(); //<생략가능> <>다이아몬드 처럼생겨서 ,C08Diamond
		
		ArrayList<Map<String, Integer>> list3 = new ArrayList<Map<String, Integer>>();
		ArrayList<Map<String, Integer>> list4 = new ArrayList<>();//<생략가능> <> ,앞으로는 이렇게사용
		
		
	}
}
