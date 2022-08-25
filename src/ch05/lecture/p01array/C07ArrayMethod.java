package ch05.lecture.p01array;

public class C07ArrayMethod {
	public static void main(String[] args) {
		int[] arr1 = {-5, -4, -3};
		int[] arr2 = {4, 5, 6, 7};
		int[] arr3 = {300, 200, 100, 50, 40};
		
		int sum1 = sumFirstLast(arr1);
		System.out.println(sum1); //
		
		int sum2 = sumFirstLast(arr2);
		System.out.println(sum2); //
		
		int sum3 = sumFirstLast(arr3);
		System.out.println(sum3); //
		
		int sum4 = sumFirstLast(new int[] {9, 8}); //new int[] {9, 8} : 새로운 int배열타입 9,8을 파라미터에 넣음.
		System.out.println(sum4); //
		
		System.out.println(sumFirstLast(new int[] {8, 7, 6, 5})); // 13
		System.out.println(sumFirstLast(new int[] {1000})); // 2000
	}
//	public	모든 곳에서 접근 가능
//	private	자기 자신 클래스에서만 접근 가능
//	protected	자기 자신 클래스와 상속된 클래스에서 접근 가능
	private static int sumFirstLast(int[] arr) {
//		
//		int first = arr[0];
//		int last = arr[arr.length - 1];
//		
//		return first + last;
		return arr[0] + arr[arr.length - 1];
	}
	
}
