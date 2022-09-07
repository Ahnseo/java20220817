package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		
		Integer a = 99;
		
		//참조타입을 기본타입으로 변경 ( unboxing ) 해야했는데ㅡ,
		int b = a.intValue();
		
		//너무 자주쓰다보니
		// 참조타입을 기본타입으로 자동변경하게 됨 ( auto unboxing )
		int c = a;
		
		Object d =99;
//		Integer e =d;//x  Object > Integer 
//		int f = d;  //x  Object > Integer 
		
		int g = (Integer) d; // 강제형변환은 할수있지만, 위험한코드가 됨
		
		Object[] arr = {"java", 3, 3.14};
		String s = (String)arr[0]; //강제형변환.
		Integer i = (Integer)arr[1];//강제형변환.
		Double j = (Double)arr[2];//강제형변환.
	}
}
