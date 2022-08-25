package ch05.lecture.p02reference;

import java.util.Arrays;

public class C09Reference {
	public static void main(String[] args) {
		int[][] a = {{5,4}, {100, 200}, {9}};
		
		System.out.println(Arrays.deepToString(a)); //Arrays.deepToString(a)
//		1차원 배열 : toString 메소드
//		다차원 배열 : deepToString 메소드
		
		int[][] b = a; //a와b는 같은 주소의 배열을 참조함.
		System.out.println(Arrays.deepToString(b)); //a 와 같은 값 출력됨
		
		a[0][0] = 55; 
		System.out.println(b[0][0]); // ? 값 생각해보기
		
		a[0] =new int[] {7, 5};
		System.out.println(a[0][0]); // ? 값 생각해보기
		System.out.println(b[0][0]); // ? 값 생각해보기
		
	}
	
}
