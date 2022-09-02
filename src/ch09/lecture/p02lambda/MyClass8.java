package ch09.lecture.p02lambda;

import java.util.Arrays;

public class MyClass8 {
	public static void main(String[] args) {
			
		int[] arr1 = new int[10];
		System.out.println(Arrays.toString(arr1));
		
		Arrays.setAll(arr1, i -> i);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.setAll(arr1, i -> i + 1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.setAll(arr1, i -> i * 2  );
		System.out.println(Arrays.toString(arr1));
	}
}
