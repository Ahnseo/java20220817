package ch04.book;

public class p112IfElseExample {
	public static void main(String[] args) {
		int score = 80;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A등급 입니다.");
		}else if(score>=80){
			System.out.println("B등급 입니다.");
		}else if(score>=70) {
			System.out.println("C등급 입니다.");
		}else if(score>=60) {
			System.out.println("D등급 입니다.");
		}else {
			System.out.println("불합격 재시험 입니다.");
		}
		
		System.out.println("수고하셨습니다.");
	}
}
