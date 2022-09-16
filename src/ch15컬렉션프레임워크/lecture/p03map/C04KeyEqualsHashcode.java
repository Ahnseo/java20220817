package ch15컬렉션프레임워크.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C04KeyEqualsHashcode{
	public static void main(String[] args) {
		//key는 equals 메소드 활용해서 같은 지 다른 지 확인
		
		Map<Book, Integer> map = new HashMap<Book, Integer>();
		map.put(new Book("java"), 30000);
		map.put(new Book("spring"), 50000);
		map.put(new Book("html"), 70000);
		map.put(new Book("java"), 10000); //중복되는것을 덮어씌우기-> class Book 에 이퀄즈,해쉬코드 override로  
		
		//전체 탐색
		map.forEach( (k,v) -> System.out.println( k + "," +v ) );
		
	}
}

class Book{
	private String title;
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	//toString 을 왜 Override할까? ->  이거 좀 이해하기 어려운데..?
	
	@Override
	public String toString() {
		// 리턴 title  , 리턴(필드명)해줘야  map의 key 값이 String타입으로 저장됨.
		return title; 
	}

	//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
