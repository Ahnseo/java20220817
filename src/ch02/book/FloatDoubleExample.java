package ch02.book;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//float type , double type 
		//실수값 저장
		
		double val1 = 3.14;
//		float val2 = 3.14; //컴파일 에러
		float val3 = 3.14F;
		
//		정밀도 테스트
		double val4 =0.1234567890123456789;
		float val5 =0.1234567890123456789F;
		
		System.out.println(val1);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		
		//e 사용하기
		int val6= 3000000;
		double val7 = 3e6; //3 * 10의6승
		float val8 = 3e6F; //3* 10의6승
		double val9 = 2e-3; //2*10의-2승
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
		System.out.println(val9);
		
		
		
		
		
	}
}
