package ch11.lecture.p02wrapper;

public class C02AutoBoxing {
	public static void main(String[] args) {
		
		int a = 3; 
		
		// 기본타입을 참조타입으로 변경하는 방법이 이것인데,
		int b = Integer.valueOf(3);
		
		//너무 자주쓰니까
		//기본타입을 참조타입으로 자동으로 변경하게 해줌.
		Integer c = a; //ok
		
		Object d = a;
		Object e = 99;
		
		Object[] arr = {"java",3};
	}
}
