package ch04.preview;

import java.util.Scanner;

public class ch04Excercise07복습해보기 {
	public static void main(String[] args) {
		//while 문과 scanner를 이용
		//키보드로 부터 입력된 데이터를 
		//예금, 출금, 조회, 종료  기능 을 제공하는 코드 작성
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0; // 잔액		

		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
		
			int userNumber = scanner.nextInt(); //엔터까지 입력값 받기
			
			switch(userNumber) {
				
				case 1: 
					System.out.print("예금 > ");
					int inMoney = scanner.nextInt();//엔터까지 입력값 받기
					balance += inMoney;
					break;
				case 2:
					System.out.println("출금 > ");
					int outMoney = scanner.nextInt();//엔터까지 입력값 받기
					balance -= outMoney;
					break;
				case 3:
					System.out.println("잔고 > " + balance);
					break;
				case 4:
					System.out.println("종료");
					run = false;
					break;
				default:
					System.out.println("1~4번을 입력하세요.");
					break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
