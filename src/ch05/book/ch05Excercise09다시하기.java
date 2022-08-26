package ch05.book;

import java.util.Scanner;

public class ch05Excercise09다시하기 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null ;
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
				studentNum = scanner.nextInt();
				System.out.println(studentNum);
				
				
				
			}else if(selectNum == 2){
				//작성위치
				System.out.println("점수입력> ");
				for(int i = 0; i < studentNum; i++) {//학생수 만큼 늘려나갈때 배열을 생성해야함
					System.out.print("scores["+i+"] : "+ scores[i]);
					scores[i] = scanner.nextInt(); // 숫자입력을 배열로 할당
				}
				
				
			}else if(selectNum == 3){
				//작성위치
				System.out.println("점수 리스트");
				for(int item : scores) {
					System.out.println(item);
				}				
				
			}else if(selectNum == 4){
				//작성위치
				//최고점수는? 평균은?
				int max = 0;
				int sum = 0;
				int count = 0;
				for( int item : scores) {
					
					if(max<item) {
						max = item;
					}
					
					sum += item;
					count++;
				}
				System.out.print("최고점수 : " + max);
				System.out.print("평균점수 : " + (double)sum / count);
			
				
			}
			else if(selectNum == 5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
