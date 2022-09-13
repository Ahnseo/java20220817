package ch13.book.s1302.p656;

import ch06.book.excercise.exam14.App;

public class BoxExam {
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동");
		
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		
		
	}
}
