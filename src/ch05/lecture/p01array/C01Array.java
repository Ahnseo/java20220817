package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[] 배열명 : '뭐뭐 타입 배열' '배열명'
		
		int[] arr1;  //int배열타입 : arr1 배열이 저장하는 값의 타입은 int 
		double[] arr2;//double배열타입 : arr2 배열이 저장하는 값의 타입은 double
		String[] arr3;//String배열타입 : arr3 배열이 저장하는 값의 타입은 String
		
//		int arr10[]; //자주 보지않지만 가능
//		double arr11[];
//		String arr12[];
		
		int[] arr4;   
		arr4 = new int[5]; // int 값 5개 저장할 공간 생성
		// arr4는 0번 index 부터 4번 index까지 총 5개 생성
		arr4[0] = 10;
		arr4[1] = 9;
		arr4[2] = 8;
		arr4[3] = 7;
		arr4[4] = 6;
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		
		System.out.println(); //줄 띄움
		
		int a =arr4[1];
		System.out.println(a);
		
	
		
		
		
		
				
		
	}
}
