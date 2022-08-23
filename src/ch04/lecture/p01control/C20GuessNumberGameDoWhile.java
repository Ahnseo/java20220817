package ch04.lecture.p01control;

import java.util.Scanner;

public class C20GuessNumberGameDoWhile {

	public static void main(String[] args) {
		
		int diceNumber = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		int userNumber=0;
		
		System.out.println("1~100 숫자 입력하세요");
		do {
			userNumber = scanner.nextInt();
			
			if (diceNumber ==userNumber) {
				System.out.println("정답");
				break;
			}else if(diceNumber>userNumber) {
				System.out.println("더 큰 수를 입력하세요");
			}else
				System.out.println("더 작은 수를 입력하세요"); 
		}while(diceNumber != userNumber);
			System.out.println("프로그램 종료");
	}
}
