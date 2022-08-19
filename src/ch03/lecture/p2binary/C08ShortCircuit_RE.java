package ch03.lecture.p2binary;

public class C08ShortCircuit_RE {
	public static void main(String[] args) {
		// short circuit
		// &&, || => 발생
		
		//  &는 두 조건을 무조건 검사하는것이고, 
		// &&는 첫번째 조건이 참일때만 검사하는것이다  
		// | 와 || 도 동일하다.
		
		int i = 3;
		
		if (i < 0 && i > -5) { //i < 0 에서 false 이니까 건너뜀.(숏트)
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		if ((i++) < 0 && (i++) > -5) { //(i++) < 0 에서 false이니까 건너뜀 (숏트)
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		System.out.println("i:" + i); // (i++) < 0 이후 i = 4 가되었다.
		
		
		// &, | => 발생안함  &, | 는 두 조건을 무조건 검사하기 때문이다.
		int k = 3;
		if ((k++) < 0 & (k++) > -5) {
			System.out.println("j는 -5보다 크고 0보다 작다");
		}
		System.out.println("k:" + k);
		
		System.out.println("프로그램 종료");
	}
}