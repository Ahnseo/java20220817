package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		
//		sum(1,10) ; // 1부터 10 의 정수 합 출력
//		sum(1,100) ; // 1부터 10 의 정수 합 출력
//		sum(50,200) ; // 1부터 10 의 정수 합 출력 
		
		// 위의 조건에 맞는 메소드 작성하기 
		
		integerSum(1, 10);
		integerSum(1, 100);
		integerSum(50, 200);
	}
	
	public static void integerSum(int p1, int p2) {
		
//		int summy = 0;  
		long summy = 0;  // 더한 값이 커지기때문에 ,그냥 더 큰 타입으로 일부러 설정함.
		for(int i = p1; i <= p2; i++ ) {
			summy += i ; 
		}
		System.out.println(summy);
		
	}
}
