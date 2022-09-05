package ch10.lecture.p01exception;

public class C02NullPointException {
	public static void main(String[] args) {
		String a = "aaaaa";
		String b = null; //참조하는 인스턴스 없는 상태
		
		
		System.out.println(a.length());
		System.out.println(b.length()); // nullPointException
		System.out.println("프로그램종료");
	}
}
