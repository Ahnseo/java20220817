package ch15컬렉션프레임워크.book.exercise.p10Comparable;

public class Student implements Comparable<Student>{
	public  String id;
	public  int score;
	
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}

	public  String getId() {
		
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}

	public  int getScore() {
		return score;
	}

//	public void setScore(int score) {
//		this.score = score;
//	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (score != other.score)
			return false;
		return true;
	}
	
	//public class Student implements Comparable<Student>
		@Override
		public int compareTo(Student o) {
			
			return this.score - o.score; //score 기준으로 오름차순 정력시킴
		}
	
	
	
	
	
}
