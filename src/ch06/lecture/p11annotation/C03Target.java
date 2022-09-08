package ch06.lecture.p11annotation;

@MyAnnotation3
public class C03Target {
	
	@MyAnnotation3
	private int i;
	
	@MyAnnotation3
	public C03Target() {
		// TODO Auto-generated constructor stub
	}
	@MyAnnotation3
	private void method(@MyAnnotation3 int i) {
		// TODO Auto-generated method stub
		@MyAnnotation3
		int j;// <- LOCAL_VARIABLE ㅋ..
	}
	
}
