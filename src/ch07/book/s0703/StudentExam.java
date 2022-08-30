package ch07.book.s0703;

public class StudentExam {
	public static void main(String[] args) {
		
		Student student = new Student("홍길동", "123456-7890", 1);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		
		//보통 getter로 많이사용.
		System.out.println(student.getName());
		System.out.println(student.getSsn());
		System.out.println(student.getStudentNo());
	}
}
