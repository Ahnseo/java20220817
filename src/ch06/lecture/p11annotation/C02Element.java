package ch06.lecture.p11annotation;

import ch05.book.s050701.Week;

public class C02Element {
	@MyAnnotation2(value = "부가적인 정보")
	private int i;
	
	@MyAnnotation2("부~가적인 정보") //value 생략가능
	private int j;
	
	@MyAnnotation2 //@MyAnnotation2 int age 적용
	private int k;
	
	@MyAnnotation2(value ="iceman", age=30) //여러개 적용하려면, 다 작성해야함
	private int l;
	
	@MyAnnotation2(week = Week.FRIDAY)
	private int m;
	
	@MyAnnotation2(names= "aa,bb,cc,dd")
	private int n;
	
	
	
	
	
	
	
}
