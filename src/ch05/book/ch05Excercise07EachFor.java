package ch05.book;

public class ch05Excercise07EachFor {
	public static void main(String[] args) {
//		int max = Integer.MIN_VALUE;
		int[] array = {1,5,3,8,2};
		
		//합, 평균
		int sum =0;
		for(int num : array) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println((double)sum/array.length);
	}
}
