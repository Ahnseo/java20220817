package ch16.lecture.book.exercise.p7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam {
	public static void main(String[] args) {
		
		//개발자인 사람만 리스트에 수집 출력.
		
		List<Member>list =Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		List<Member> developers = list.stream()
									.filter(m -> m.getJob().equals("개발자"))
									.collect(Collectors.toList());
		
		developers.stream().forEach(m-> System.out.println(m.getName()));		
	}
	
	static class Member{
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		public String getName() {
			return name;
		}
		public String getJob() {
			return job;
		}
		
	}
}	
