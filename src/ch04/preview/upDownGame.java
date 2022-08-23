package ch04.preview;

import java.util.Scanner;

public class upDownGame {
	//up & down 게임 ,컴퓨터 1~100 랜덤 
	public static void main(String[] args) {
		int number = (int)(Math.random()*100) + 1; //100 까지의 랜덤 숫자 지정

		Scanner scanner = new Scanner(System.in); //키보드입력을 받을 수 있게함
		
		boolean run = true;
		while(run) {
			System.out.println("1~100 사이값을 입력하세요.");
			int user = scanner.nextInt(); //사용자가 입력한 수를 엔터까지 스캔
			System.out.println(user);
			if(number == user) {
				System.out.println("정답입니다.");
				break;
			}else if (number > user) {
				System.out.println("더 큰 값을 입력하세요.");
			}else
				System.out.println("더 작은 값을 입력하세요.");
		}
		System.out.println("프로그램 종료");
	}
}
