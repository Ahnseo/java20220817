package ch05review;

import java.util.Arrays;
import java.util.Iterator;

public class Excercise07 {
	public static void main(String[] args) {
		
		//배열의 항목에서 최대값을 구하세요 (for문 이용)
		
		int max;
		int[] arr = {1, 5, 3 ,8, 2 };
		
		//작성위치
		//나열해보자
		 Arrays.sort(arr); // 배열 자체를 정렬된 순서로 변경
//		for(int i =0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		 max = arr[arr.length-1];
		System.out.println("max: " + max);
				
				
	}
}
