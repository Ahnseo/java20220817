package ch03.book;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode ='A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		if( !(charCode<48) && !(charCode>57)) {   // true && false => false
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if( ((value % 2 == 0 ) | (value % 3) == (0 )) ) {
			System.out.println("6은 2 또는 3의 배수이군요");
		}
		if( (value % 2 == 0 ) || (value % 3 == 0 ) ) {
			System.out.println("6은 2 또는 3의 배수이군요");
		}else {
			System.out.println("2또는 3의 배수가 아닙니다");
		}
	} 
}
