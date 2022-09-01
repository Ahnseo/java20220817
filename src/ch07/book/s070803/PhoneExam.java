package ch07.book.s070803;

public class PhoneExam {
	public static void main(String[] args) {
		
//		Phone phone =new Phone() {}; //x  abstract 클래스이기떄문
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		/**추상클래스 : 부모클래스를 직접적으로 사용 x */
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
