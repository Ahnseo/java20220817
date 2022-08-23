package ch04.lecture.p01control;

public class C03ElseIf {
	public static void main(String[] args) {
		// else of : 이전 조건이 false 일때, 다시 조건 확인 하도록 함
		// else if 여러개 쓸 수 있다.
		
		
		System.out.println(1);
		
		if(false) {
		System.out.println(2);
		}else if(false) {
		System.out.println(3);
		}else if(true){
		System.out.println(4);
		}else
		System.out.println(5);
		
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		 
		//1,4,6,7
	}
}
