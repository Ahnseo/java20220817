package ch02.book;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2 ;
		int byteValue3 = byteValue1 + byteValue2 ;
		System.out.println(byteValue3);
		
		char charValue1 ='가';
		char charValue2 ='나';
//		char charValue3 = charValue1 + charValue2;
		int charValue3 = charValue1 + charValue2;
		System.out.println("유니코드:"+charValue3);
		System.out.println("출력문자:"+(char)charValue3);
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;
		System.out.println(intValue2); //integer 출력이기 때문에 값은 2
		
		int intValue3 = 10;
//		int intValue4 = intValue3/4.0;
		double intValue5 = intValue3/4.0; // 나누기를 double 로 했으니, double 타입이 되었다.
		System.out.println(intValue5);
		
//		int class 
		
		
				
		
		
		
		
		
		
		
	}
}
