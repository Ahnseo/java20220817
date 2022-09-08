package ch05.book.s050703;

import ch05.book.s050701.Week;

public class EnumMethodExam {
	public static void main(String[] args) {
		
		//name()
		Week today = Week.SUNDAY;
		
		String name =today.name();
		System.out.println(name);
		
		//ordinal() //객체의 순번(0부터~)을 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);//0,1,2,3,4,5,'6번째:SUNDAY'
		
		//compareTo()
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() : 주어진 문자열의 열거 객체를 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이네요.");
			}else {
				System.out.println("평일이네요");
			}
		}else {
			System.out.println("주말인지 평일인지 알수없네요.");
		}
		
		//values() : 모든 열거 객체들을 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
		
		
		
		
	}
}
