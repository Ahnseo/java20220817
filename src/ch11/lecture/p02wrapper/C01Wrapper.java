package ch11.lecture.p02wrapper;

import java.util.Arrays;


public class C01Wrapper {
	public static void main(String[] args) {
		//data type : 기본타입 과 참조타입 인데
		//참조타입을 기본타입처럼쓰고싶을때가 있다.
		
		//기본타입 8개 - 매칭되는 -> 참조타입 8개 가 있다. (책 p527)
		//byte => Byte
		//int => Integer
		//s
		//
		//
		//
		//
		
		String[] arr1 = new String[3];
		arr1[0] = "a";
		arr1[1] = "b";
		arr1[2] = "c"; 
		
		int[] arr2 = new int[3];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3; 
		
//		섞어서 넣고싶을때,
		int a = 3; //기본 타입
		Integer b = Integer.valueOf(3); //참조타입이 됨
		
//		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		Object[] arr3 = new Object[3];
		arr3[0] = "string";
		arr3[1] = Integer.valueOf(99); // 코드가 지저분한 느낌,, 그래서 바꾸고싶었음 , 다음 C02에서 
		arr3[2] = Integer.valueOf(100);
		System.out.println(Arrays.toString(arr3));
	}
}
