package ch11.book.s111203;

public class StringToPrimitiveValue {
	public static void main(String[] args) {
		
		//문자열을 기본타입값으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
