package ch06.book.p246;

public class PersonExam {
	public static void main(String[] args) {
		
		Person p1 =new Person("123456-1234567","서정");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation ="USA"; // Class final 재설정 불가
//		p1.ssn = "9876-54321";//Class final 재설정 불가
		p1.name="홍길동"; 
		System.out.println(p1.name);
		
		
	}
	
}
