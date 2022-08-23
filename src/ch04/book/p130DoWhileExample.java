package ch04.book;

import java.util.Scanner;

public class p130DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q 를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //커서 처음부터 엔터까지 스캔
			System.out.println(inputString);
		}while(!inputString.equals("q")); //string 비교는 .equals 사용
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}
