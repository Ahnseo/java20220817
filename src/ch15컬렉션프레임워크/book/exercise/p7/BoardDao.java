package ch15컬렉션프레임워크.book.exercise.p7;

import java.util.ArrayList;
import java.util.List;

//게시물을 가져오는 .. 클래스작성

class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();

		/** 객체 = new Board("제목1", "내용1") 
		 * 풀어서 쓰면..
		 * Board str1 = new Board("제목1","내용1");
		 * list.add(str1);
		 */
		 
//		list.add(new Board("제목1", "내용1")); 
		Board str1 = new Board("제목1","내용1");
		list.add(str1);
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}
}
