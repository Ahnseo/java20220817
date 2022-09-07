package ch11.book.s111202;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		//Auto Boxing
		Integer obj = 100;
		System.out.println("Integer obj 값: "+ obj.intValue());
		
		//대입 시 Auto UnBoxing
		int value = obj;
		System.out.println("int value 값 : "+ value);
		
		//연산 시 AutoUnBoxing
		int result = obj + 100;
		System.out.println("int result 값 : "+result); //100 + 100 = 200
		
	}
}
