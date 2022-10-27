package ch14.book.exercise.p6;

import java.util.function.ToIntFunction;

public class LambdaExam {
	
	private static Student[] students = {
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
	};
	
	//avg() 메소드 작성 , 평균
	public static double avg(ToIntFunction<Student> function) {
		double sum = 0.0;
		
		for(Student student : students) {
			sum += function.applyAsInt(student);
			
		}
		return sum/students.length;
		
	}
// /////////////////////////////////////////////////////////////////////////////////////////////////
public static void main(String[] args) {
	double englishAvg = avg( s -> s.getEnglishScore() ); // s 객체생성 하고 -> s.getEnglishScore()
	System.out.println("영어평균:" + englishAvg);
		
	double mathAvg = avg( s -> s.getMathScore() );
	System.out.println("수학평균:" + mathAvg);
		
}
// Student class를 Type으로 사용하고,
// get set 메소드를 위의 main메소드에 적용하려고 만들었구나.
public static class Student{
	
	private String name;
	private int englishScore;
	private int mathScore;
		
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}
	
}

