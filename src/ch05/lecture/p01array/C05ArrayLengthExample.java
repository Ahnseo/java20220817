package ch05.lecture.p01array;

public class C05ArrayLengthExample {
	public static void main(String[] args) {
		
		//메소드명:'printLength' 라는 메소드를 만들어서
		
		int[] arr1 = {100, 200, 300};
		
		int[] arr2 = {9, 8};
		
		int[] arr3 = {2};
		
		int[] arr4 = {};
		
		printLength(arr1); //3 출력
		printLength(arr2); //2
		printLength(arr3); //1
		printLength(arr4); //0
		printLength(new int[] {9,8,7,6,5}); //5
	}
	
	public static void printLength(int[] p) {
		System.out.println(p.length);
	}
}
