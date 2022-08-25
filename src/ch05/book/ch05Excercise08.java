package ch05.book;

public class ch05Excercise08 {
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
				};
		
		int sum = 0;
		int sumLength = 0;
		double avg = 0.0;
		int count = 0; //선생님 방법
		for(int i =0; i < array.length; i ++) {
			
			sumLength += array[i].length; 
			
			for(int k=0; k < array[i].length; k++) {
//				System.out.println(array[i][k]);
				
				sum += array[i][k];	
				count++;
			}
		}
		
		avg = (double) sum / sumLength;
		
		System.out.println(sum);
		System.out.println(sumLength);
		System.out.println(avg);
		System.out.println((double)sum / count); //선생님 방법으로 평균 구한것
	}
}
