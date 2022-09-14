package ch15컬렉션프레임워크.book.s150202p730;

import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		List<Borad> list = new Vector<Borad>();
		
		list.add(new Borad("제목","내용1","글쓴이1"));
		list.add(new Borad("제목","내용2","글쓴이2"));
		list.add(new Borad("제목","내용3","글쓴이3"));
		list.add(new Borad("제목","내용4","글쓴이4"));
		list.add(new Borad("제목","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Borad borad = list.get(i);
			System.out.println(borad.subject + borad.content + borad.writer);
		}

	}
}

class Borad {
	String subject;
	String content;
	String writer;
	
	public Borad(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}