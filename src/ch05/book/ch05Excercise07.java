package ch05.book;

public class ch05Excercise07 {
	public static void main(String[] args) {
//		int max =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE; //아하..!
		
		int[] array = {1,5,3,8,2};
		//작성위치
//		주어진 배열의 항목에서 최대값을 구하세요 for문
		
		for(int i = 0; i < array.length; i++) { //for문으로 배열을 탐색,

			if(array[i] > max) {
				max = array[i]; //크면, 할당 ,작으면 다시반복
			}
				
			if(array[i]< min ) {
				min = array[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
