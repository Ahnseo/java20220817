package ch04.lecture.p01control;

import java.util.Scanner;

public class C16ScannerFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //키보드로 입력받은 값을 스캔함
		
		System.out.println("첫번째 정수 입력 :");
		int firstNumber = scanner.nextInt();
		
		System.out.println("마지막 정수 입력(1보다 큰수) : ");
		int lastNumber = scanner.nextInt();
		
		int sum = 0;
		for (int i = firstNumber; i <= lastNumber; i++) {
			sum += i;
		}
		System.out.println(firstNumber + "부터" + lastNumber + "까지 합= " + sum);
	}
}
