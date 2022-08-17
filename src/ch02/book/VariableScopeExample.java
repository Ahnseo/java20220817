package ch02.book;

public class VariableScopeExample {
	public static void main(String[] args) {
//		//변수 사용 범위
//		int v1 = 15;	
//		if( v1 > 10 ) {
//			int v2 = v1 - 10;		
//		}		
//		int v3 = v1 + v2 + 5;   // v2 값을 찾을수없음. v2 변수가 코드블록 밖에서 실행되어서
	
		
//		새로운 변수 선언 v4,v5,v6
		
		int v4 = 15;	
		if( v4 > 10 ) {
			int v5 = v4 - 10;		
			int v6 = v4 + v5 + 5; 
			System.out.println(v6);
		}
//		System.out.println(v6); // 변수가 코드 블록 밖에서 선언 되었기 때문에 오류
	};
}
