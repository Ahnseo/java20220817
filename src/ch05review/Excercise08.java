package ch05review;

public class Excercise08 {
	public static void main(String[] args) {
		//배열 전체 항목의 합과 평균을 구하시오
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum =0;
		double avg =0.0;
		//작성위치
		for(int i =0; i < array.length; i ++) {
			for(int k = 0; k < array[i].length; k++) {
//				System.out.println(array[i][k]);
				sum += array[i][k];
			}
		}
		System.out.println("합:" + sum);
		avg = (double) sum / array.length;
		System.out.println("평균:" + avg);
	}
}
