package ch05.book;

public class p158ArrayLengthExample {
	public static void main(String[] args) {
		
		// scores 배열의 총합과 평균을 구하자
		int[] scores = new int[] { 83, 90, 87 };
		
		int sum =0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+ sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("평균 : " + avg);
	}
}
