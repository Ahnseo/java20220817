package ch13.lecture.p01generic;

import java.util.Arrays;

public class C01ArrayList {	
	//먼저 15장의 안배운내용을 사용하여 설명
	public static void main(String[] args) {
		int[] arr = {3,6,9}; //자바는 새로운 배열을 수정하기 힘들기때문에
		
		int[] arr2 = new int[arr.length +1];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr2.length-1] = 12; //12 를 넣고싶어서 이렇게 긴 코드를 씀..
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
