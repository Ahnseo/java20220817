package ch04.book;

import java.util.Scanner; // scanner 

public class ch04Excercise07 {
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
			System.out.print("선택>");
			
			int selectNumber = scanner.nextInt(); // switch (입력변수) 위치를 잘못 놓아서, 오류 났었음..
			switch (selectNumber) {
			case 1:
				//예금
				System.out.print("예금액 > ");
				int inMoney = scanner.nextInt();
			    balance += inMoney;
				break;
			case 2:
				//출금
				System.out.print("출금액 > ");
				int outMoney = scanner.nextInt();
			    balance -= outMoney;
				break;
			case 3:
				//잔고
				System.out.println("잔고액 > " + balance);
				break;
			case 4:
				//종료
				System.out.println("프로그램 종료");
				run = false;
				break;
				
			default:
				break;
			}
		}		
	}
}
