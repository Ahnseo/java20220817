package ch05.book;

public class p154ArrayCreateByValueList2 {
	public static void main(String[] args) {
		int[] scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("scores 총합 : " + sum1 );
		
		//메소드를 이용한 배열의 합 구하기
		int sum2 = add(new int[] {83, 90, 87}); //add(); 라는 메소드 작성해보자. 메소드명:add  
		System.out.println("method를 사용한 scores총합 : "+ sum2);
		System.out.println();
	}

	private static int add(int[] p1) {
		int sum =0;
		for(int i =0; i < p1.length ; i++) {
			sum += p1[i];
		}
		return sum;
	}
}
