package ch02.leacture;

public class C01Variable {
	public static void main(String[] args) {
		//변수 : 값을 저장하는 공간의 이름
		//타입명 변수명;
		int a; //a 라는 int타입  변수 선언
		a = 3; //a 변수에 3 대입(할당)
		
		int b = 3; // 변수 선언 및 값 할당
		//변수명 작성 규칙
		//사용할 수있는 문자 : 영문대소문자 , 숫자 , $ , _ 
		//숫자로 시작하면 안됨,
		//키워드 사용하면 안됨.
		//같은 변수명 재선언 안됨
		
		//변수명 작성 관습 : lowerCamelCase
		
		
		
		int c; //대소문 구분 
		int C; //대소문 구분 
		int A; //ok
		int $; //ok
		int _a;//ok
//		int _; //x 
//		int 3; //x
		//변수명 작성 관습 : lowerCamelCase
		
		int myCar;
		int studientNumber;
		int our_home; //x 
		int ourHome; //ok
		
	}
}
