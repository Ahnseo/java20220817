package ch11.book.s110301;

public class MemberExam  {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//지금은 Member클래스 속, 오버라이드 된 equals 메소드 사용중..
		if(obj1.equals(obj2)) {
			System.out.println("obj1 == obj2");
			
		}else {
			System.out.println("obj1 != obj2");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 == obj3");
			
		}else {
			System.out.println("obj1 != obj3");
		}
		
	}
}
