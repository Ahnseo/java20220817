package ch11.lecture.p05class;

public class C01Class {
	public static void main(String[] args) throws Exception {
		//Class 클래스 (검색 api 할때를 공부중..)
		
		
		Class c;
		String s1 = "java";
		
		//instance 의 getClass()
//		Class<String> c1 = (Class<String>) s1.getClass();
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		//Class forName()
		Class c2 = Class.forName("java.lang.String"); //throws Exception
		System.out.println(c2.getName());
		//Class키워드 사용
		Class c3 = String.class;
		System.out.println(c3.getName());
	}
}
