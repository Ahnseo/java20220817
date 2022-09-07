package ch11.book.s110303p465;

public class SmartPhoneExam {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		System.out.println(myPhone.toString());
		
		System.out.println(myPhone); //println(Object x) 적용중
	}
}
