package ch04.preview;

public class p118SwitchCharExample {
	public static void main(String[] args) {
		char grade ='c';
		//char type 도 가능
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("등급 A 입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("등급 B 입니다.");
				break;
			default : 
				System.out.println("등급 C 입니다.");
											
		}
	}
}
