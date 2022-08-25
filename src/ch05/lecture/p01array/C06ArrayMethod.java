package ch05.lecture.p01array;

public class C06ArrayMethod {
	public static void main(String[] args) {
		int[] arr1 = {9, 8};
		int[] arr2 = {100, 50};
		int[] arr3 = {99, 100, 101};
		
		printFristItem(arr1); //9 출력
		printFristItem(arr2); //100
		printFristItem(arr3); //99
		printFristItem(new int [] {10000}); //10000
		
		System.out.println("-----");
		
		printLastItem(arr1); //8 출력
		printLastItem(arr2); //50
		printLastItem(arr3); //101
		printLastItem(new int[] {-1}); //-1
		
		System.out.println("-----");
		
		printMiddleItem(arr1); //8    짝수개 일땐, 중앙에서 오른쪽꺼
		printMiddleItem(arr2); //50  짝수개 일땐, 중앙에서 오른쪽꺼
		printMiddleItem(arr3); //100
		printMiddleItem(new int[] {5,6,7,8,9}); //7  // (int) 5 / 2 = 2 이므로, a[2] 출력
		printMiddleItem(new int[] {100,200,300,400});// 300 // (int) 4 / 2 = 2 이므로, a[2] 출력
		
		System.out.println("-----");
		
		//메소드 작성으로 출력해보자 : 메소드명(파라미터:타입+인수){코드블럭};
		//return 코드가 필요없는 method : void 사용
	}
	public static void printFristItem(int[] arr) { //int[] arr : integer배열 타입의 파라미터 arr 라고 설정
		System.out.println(arr[0]);
	}
	public static void printLastItem(int[] arr) {
		System.out.println(arr[arr.length-1]);
	}
	public static void printMiddleItem(int[]arr) {
		System.out.println(arr[arr.length/2]);     
	}
	
}
