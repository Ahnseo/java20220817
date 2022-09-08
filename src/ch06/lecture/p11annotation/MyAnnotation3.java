package ch06.lecture.p11annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(value = {ElementType.TYPE,
				ElementType.FIELD,
				ElementType.METHOD,
				ElementType.CONSTRUCTOR,
				ElementType.PARAMETER,
				ElementType.LOCAL_VARIABLE})

public @interface MyAnnotation3 {
	//Annotation 에 Annotation
	// Target Annotation 
	
	
	
}
