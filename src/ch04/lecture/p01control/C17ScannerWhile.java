package ch04.lecture.p01control;

import java.util.Scanner;

public class C17ScannerWhile {
	public static void main(String[] args) {
		//주사위 게임
		
		Scanner scanner = new Scanner(System.in);
		
		//정답일때 까지, 실행되도록 while문 으로
		
		while(true) {
			System.out.println("번호를 입력하세요 1~6");
			
			int userNumber = scanner.nextInt();
			int dice = (int) (Math.random()*6) + 1;
			System.out.println("주사위결과:" +dice);
			
			if(userNumber == dice) {
				System.out.println("정답입니다.");
				break;
				
			}else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
