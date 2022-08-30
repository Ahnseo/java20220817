package ch07.book.s0703;

//상속 People
public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo ) {
		super(name, ssn); //상위클래스 생성자 작성
		this.studentNo = studentNo;
	}
	public int getStudentNo() {
		return studentNo;
	}
}
