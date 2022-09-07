package ch11.book.s110701;

public class p505indexOf {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("프로그래밍 시작하는 문자열: [" +location+"] 번째 부터입니다.");
		
		if(subject.indexOf("자바") != -1 ) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련없는 책이군요.");
		}
	}
}
