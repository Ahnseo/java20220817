package ch05.lecture.p02reference;

public class C08Reference {
	public static void main(String[] args) {
		int[] a = {9,8,7};
		a = changeArray(a);
		System.out.println(a[0]); //9 2
		
		
		int[] b = {5,6,7};
		b=changeArray(b);
		System.out.println(b[0]); //5 2
		
		a[0] =100;
		System.out.println(a[0]); //100
		System.out.println(b[0]); //2
		
	}

	private static int[] changeArray(int[] arr) {
		System.out.println(arr[0]);
		arr = new int[] {2, 4};
		return arr;
	}
}
