package ch06.lecture.p01field;

public class C05Field {
	public static void main(String[] args) {
		
		//새로운 인스턴스를 만들때 마다, 필드값을 한번에 출력하기
		
		MyClass04 c3 = new MyClass04("테슬라", "red", 77);
		//생성자가 필요해서,,,, 오류남
		
		
		MyClass04 c1 = new MyClass04();
		
		c1.model ="아반떼";
		c1.color ="red";
		c1.age = 99;
		
		MyClass04 c2 = new MyClass04();
		c2.model ="소나타";
		c2.color ="blue";
		c2.age = 88;
		
		
	}
}
