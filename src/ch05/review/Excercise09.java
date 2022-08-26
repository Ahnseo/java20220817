package ch05.review;

import java.util.Scanner;

public class Excercise09 {
	public static void main(String[] args) {
		boolean run = true;
//		int studentNum =0;
//		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in); //키보드 입력 받기
		
		//학생수와 학생들의 점수를 입력 받아서 
		//최고점수 와 평균점수를 구하는 프로그램 만들기
		
		System.out.println("-------------------");
		System.out.println("학생 수를 입력하려면, 숫자 1번을 누르세요.");
		System.out.println("학생들의 점수를 입력하려면, 숫자 2번을 누르세요.");
		System.out.println("입력한 점수들 중 최고점수를 알고싶다면, 숫자 3번을 누르세요.");
		System.out.println("입력한 점수들 의 평균점수를 알고싶다면, 숫자 4번을 누르세요.");
		System.out.println("-------------------");
		while(run) {
			System.out.print("숫자 선택 => ");
			
			int firstNumber = scanner.nextInt(); //1~5숫자 입력받기  
			int[][] scores = new int [][];
			switch(firstNumber) {
				case 1:
					System.out.print("학생수를 입력하세요. => ");
					int studentNum = scanner.nextInt();
					//학생수를 배열 [??][1]에 넣기
					
					 scores[0] = new int[studentNum];
					 System.out.println(scores.length+"명");
					break;
				case 2:	
					System.out.println("학생들의 점수를 넣어주세요. => ");
					int scoreNum = scanner.nextInt();
					score
					
					 scores = new int[studentNum];
					 System.out.println(scores.length+"명");
					 System.out.println("학생들의 점수를 넣어주세요. => ");
					break;
					
				
			}		
		}
	}
}
