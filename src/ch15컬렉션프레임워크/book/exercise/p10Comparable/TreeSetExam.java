package ch15컬렉션프레임워크.book.exercise.p10Comparable;

import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<>();
		
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		treeSet.add(new Student("red", 96)); //Comparable 에서 96 - 96 =0 이므로, 값 저장 안된 상태.
											// score 기준으로 equal, hashcode 넣어주면 저장할수있음.
											// 근데, key 가 다르네 ..? 키는 바뀌지않나봐.
		//true근데, key 가 다르네 ..? 키는 바뀌지않나봐.
		System.out.println(new Student("blue", 96).equals(new Student("red", 96))); 
		
		System.out.println(treeSet.size());
		
		Student student = treeSet.last();
		
		
		System.out.println("최고점수:"+ student.getScore());
		System.out.println("최고점수를 받은 id: " + student.getId());
		
	}
}
