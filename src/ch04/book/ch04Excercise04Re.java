package ch04.book;

public class ch04Excercise04Re {
	public static void main(String[] args) {
		//while 과 random을 사용하여, 
		//두개의 주사위를 던졌을 때 
		//(눈1,눈2) 형태로 출력하고, 
		//눈1 + 눈2 = 5 이면,  프로그램 종료를 던진다. (아니라면, 주사위를 계속던짐)
		
		
		while(true) {   //while 문 시작 위치는 여기. 부터
		
		int dise01 = (int)(Math.random()*6) + 1;
		int dise02 = (int)(Math.random()*6) + 1;
		
		System.out.println("(눈1 , 눈2) = "+"("+ dise01 +" , "+ dise02+")");
		
		
			if((dise01+dise02) == 5) {
				System.out.println("두 주사위의 합은 5 입니다.");
				break; 
			}else 
				
				System.out.println("두 주사위의 합이 5가 아닙니다.");
			 
		}
		System.out.println("프로그램 종료");
	}
}
