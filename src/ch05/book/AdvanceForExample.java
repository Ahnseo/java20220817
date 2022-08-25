package ch05.book;

public class AdvanceForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum =0;
		for(int num: scores) {
			sum += num;
		}
		System.out.println(sum);
		
		double avg = (double)sum / scores.length;
		
		System.out.println(avg);
		
	}
}
