package ch06.lecture.p11annotation;

import ch05.book.s050701.Week;

public @interface MyAnnotation2 {
	//부가적인 정보가 필요하다면
	
	//타입과 필드명(괄호); 
	String value() default "";
	
	int age() default 0;
	
	Week week() default Week.MONDAY; //import ch05.book.s050701.Week;
	
	String[] names() default{};
}
