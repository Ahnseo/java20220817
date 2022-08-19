package ch04.book;

public class p115IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int)(Math.random())*20 + 81;
		//(int)(Math.random())*20 : 0 ~ 19 값

		//if 중첩
		
		System.out.println("점수: "+ score);
		
		String grade;
		
		if(score>=90){
			if(score>=95) {
				grade = "A+";
			}else {
				grade ="A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			}else {
				grade ="B";
			}
		}	
		System.out.println("학점: "+ grade);
	}
}
