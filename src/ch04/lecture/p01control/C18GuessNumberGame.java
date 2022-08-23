package ch04.lecture.p01control;

import java.util.Scanner; // 스캐너 작성하려면 넣어야함 
						  // import 추가 단축키: ctrl + shift + o 

public class C18GuessNumberGame {
	//up & down 게임 ,컴퓨터 1~100 랜덤 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// 입력을 스캔한다.
		int diceNumber = (int)(Math.random()*100) + 1; // 1~100 까지 랜덤, while 문 밖에 두어야함
		
		//맞출때 까지 반복한다
		while(true) {
			System.out.println("1~100까지 숫자를 입력하세요 : ");
			int userNumber = scanner.nextInt();
			
			if(diceNumber == userNumber) {
				System.out.println("정답 입니다");
				break;
			}else if (diceNumber > userNumber) {
				System.out.println("더 큰수를 입력하세요");
			}else 
				System.out.println("더 작은수를 입력하세요");	
		}
		System.out.println("프로그램 종료");
	}
}
