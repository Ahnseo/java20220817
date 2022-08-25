package ch05.book;

public class ch05Excercise08EachFor {
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88},
		};
		
		
		//each for
		//합, 평균
		int sum = 0;
		double avg = 0.0;
		int count =0;
		
		for(int[] item: array  ) {		
			for( int num : item) {
				sum += num;
				count++;
			}
		}
		
		System.out.println("합:"+ sum);
		avg = (double) sum / count;
		System.out.println(avg);
		
	}
	
}

