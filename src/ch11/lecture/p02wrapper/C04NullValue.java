package ch11.lecture.p02wrapper;

public class C04NullValue {
	public static void main(String[] args) {
		
		int a = 3;
		Integer b= 3;
		
//		int c = null;
		Integer d = null; // 가능
		
		int e = d ; //주의해야한다. runtime exception 예외가 발생해버림 
		
		System.out.println("프로그램 실행 이어감");
	}
}
