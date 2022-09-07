package ch11.book.s110303p464;

//import java.util.Date;

import java.util.Date;

public class ToStringExam {
	public static void main(String[] args) {
		//Date 클래스는 toString()메소드를 재정의하여 현재시스템의 날짜와 시간정보를 리턴한다.
		//그리고 String클래스는 toString()메소드를 재정의해서 저장하고 있는 문자열(text)를 리턴한다.
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	}
}
