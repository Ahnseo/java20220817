package ch03.lecture.p2binary;

public class C08ShortCircuit_RE {
	public static void main(String[] args) {
		//ShortCircuit : && 와 || 에서 발생함   ( &, | 에서는 발생 안함 )
		int i = 3;
		
		if ( i<0 && i >-5) {  //i<0 에서 false 로 바로 다음 코드로 넘어가서 숏트 남 
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		if ( (i++) < 0 && (i++) >-5) {  //i<0 에서 false 로 바로 다음 코드로 넘어가서 숏트 남 
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		
		// &, | 에서는 발생 안함
		
		int j = 4;
		if ( ((j++) < 0) & ((j++) > -5) ) {  
			System.out.println("j:" + j);
		}	
	}
}
