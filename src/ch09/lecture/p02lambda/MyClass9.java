package ch09.lecture.p02lambda;

import java.util.Arrays;

import java.util.function.IntUnaryOperator;


public class MyClass9 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		setAll(arr, i -> i);
		System.out.println(Arrays.toString(arr));
		
		setAll(arr, i -> i + 1);
		System.out.println(Arrays.toString(arr));
		
		setAll(arr, i -> i * 2);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void setAll(int[] arr, IntUnaryOperator gen ) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] =gen.applyAsInt(i);
		}
	}
}
