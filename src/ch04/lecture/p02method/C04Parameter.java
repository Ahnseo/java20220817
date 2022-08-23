package ch04.lecture.p02method;

public class C04Parameter {
	public static void main(String[] args) {
		
		//여러줄이 출력되도록 파라미터와 아규먼트 추가 
		printTriangle(5); // 호출
		printTriangle(10);// 호출
		
	}//메인메소드 종료 중괄호 는 여기.
	
	public static void printTriangle(int line) { // 파라미터 type :int , argument: line (의미있는 이름으로설정)
		for(int i= 0; i<line; i++) {
			for(int j=0; j<=i; j++ )
				System.out.print("*");
		}
		System.out.println();
	}
	
	
}
		
