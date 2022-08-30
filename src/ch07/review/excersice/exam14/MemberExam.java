package ch07.review.excersice.exam14;

public class MemberExam {
	public static void main(String[] args) {
		//작성한 Member 클래스 호출
		Member user1 = new Member("홍길동", "hong", "1234", 20);
		Member user2 = new Member("박자바", "park", "5678", 30);
		
		System.out.println(user1.name +"\t"+user1.id+"\t"+user1.password+"\t"+user1.age);		
		System.out.println(user2.name +"\t"+user2.id+"\t"+user2.password+"\t"+user2.age);	
	}
}
