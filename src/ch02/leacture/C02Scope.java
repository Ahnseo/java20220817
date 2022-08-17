package ch02.leacture;

public class C02Scope {
	public static void main(String[] args) {
		//변수는 선언된 코드블럭 {} 내에서만 사용 가능
		
		int a = 3;
		if(true) {
//			int a = 5; //x  재선언 x
			int b = 4;
			System.out.println(a);  // 블록 내에 있기에 가능 
			System.out.println(b);
		}
//		System.out.println(b); //x
	}

}
