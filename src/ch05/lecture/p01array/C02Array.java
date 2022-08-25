package ch05.lecture.p01array;

public class C02Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		arr1[0] = 9;
		arr1[1] = 8;
		arr1[2] = 7;
		
		
		// 쉽게 한 줄로 배열의 값까지 넣을 수 있다, 
		// 넣은 값 만큼 공간이 생성 
		
		int[] arr2 = new int[] {9,8,7};   
		
		for(int i = 0; i <arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
