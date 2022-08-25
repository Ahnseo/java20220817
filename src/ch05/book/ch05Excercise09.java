package ch05.book;

import java.util.Scanner;

public class ch05Excercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int scoreNum =0;
		int[] scores =null;
		int sum =0;
		double avg =0.;
		Scanner scanner = new Scanner(System.in); //키보드 입력 받기
		
		//학생수와 학생들의 점수를 입력 받아서 
		//최고점수 와 평균점수를 구하는 프로그램 만들기
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료 ");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNum = scanner.nextInt();
			if(selectNum == 1){
				//작성위치
				System.out.print("학생수> ");
				int totalStudents = scanner.nextInt();
				System.out.println(totalStudents);
				studentNum += totalStudents;
				
				
			}else if(selectNum == 2){
				//작성위치
				System.out.println("점수입력> ");
				
				for(int i = 0; i < studentNum; i++) {//학생수 만큼 늘려나갈때
					//배열을 생성해야함
					scoreNum = scanner.nextInt(); //숫자입력
					scores = new int[scoreNum]; // 숫자입력을 배열로 할당
				}
				
				
			}else if(selectNum == 3){
				//작성위치
				//최고점수는? 평균은?
				int max = 0;
				int sum = 0;
				int count = 0;
				for(int i =0; i < scores.length; i++) {
					if(scores[i] > max) {
						max += scores[i];						
					}
					count++;
					sum += scores[i];
				}
				System.out.println("최고점수>" + max);
				System.out.println("평균점수>" + (double)sum / count);
			
				
				
				
			}else if(selectNum == 4){
				//작성위치
			}
			else if(selectNum == 5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
