package ch11.book.s110702;

public class StringCharAtExam {
	public static void main(String[] args) {
		String ssn = "930104-1230123";
		
		char sex = ssn.charAt(7); // 주민번호 뒷자리 첫번째 숫자로 성별 구분하기
		switch(sex) {
			case '1':
			case '3':	
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':	
				System.out.println("여자입니다.");	
				break;
		}
	}
}
