package ch15컬렉션프레임워크.book.exercise.p8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		for (Student student : set) {
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
