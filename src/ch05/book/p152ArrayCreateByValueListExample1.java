package ch05.book;

import java.util.Iterator;

public class p152ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] arr1 = new int [] {83, 90, 87};
//		int[] arr1 =  {83, 90, 87}; // 한줄로 쓰면 , new int[] 생략가능
		int sum =0;
		
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		double avg = (double) sum / arr1.length ;  //double 타입 변환해야 소수점까지 
		System.out.println("총합 : " + sum );
		System.out.println("평균 : " + avg );
		
	}
}
