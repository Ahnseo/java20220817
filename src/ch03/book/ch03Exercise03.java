package ch03.book;

public class ch03Exercise03 {
	public static void main(String[] args) {
		int score = 85;
		String result = ( !(score>90) ) ? "가" : "나"; //!(false) =>true 이므로
										//true : false;
		
		System.out.println(result);//결과 :가
	}
}
