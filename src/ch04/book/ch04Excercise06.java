package ch04.book;

public class ch04Excercise06 {
	public static void main(String[] args) {
		System.out.println("Sysout ");
		System.out.print("엔터없이 출력");   //ln 빼면
		System.out.println("정말 엔터없이 출력되었나?");
		System.out.println(); // 아무것도 작성안하면 새로운 줄
		System.out.println("위에 새로운 줄 있나?");
		
		//삼각형을 출력하는 코드작성
		
		System.out.println("별표 찍기  print, println로 분리하기");
		
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		for(int i = 1; i <= 5; i++){
			for(int j=1; j<=i; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("중첩 for문 사용해서, 역삼각형 만들기");
		
		for(int i = 1 ; i <=5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();//엔터역할
		}
	}
}
