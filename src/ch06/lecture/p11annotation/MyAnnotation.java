package ch06.lecture.p11annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
	//
public @interface MyAnnotation {
	//Retention Annotation
	//실행할때 알려줄지, 실행후에 알려줄지.
}
