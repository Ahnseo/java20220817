package ch06.lecture.p01field;

public class C03Field {
	
	public static void main(String[] args) {
		
		//MyClass02의 클래스를 적용시켜  보기
		MyClass02 c1 = new MyClass02();
		
		c1.name ="java";
		c1.color ="red";
		c1.age = 90;
		c1.score = 80;
		
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.age);
		System.out.println(c1.score);
		
		MyClass02 c2 = new MyClass02();
		c2.name = "서정";
		c2.color ="blue";
		c2.age = 30;
		c2.score = 70;
		System.out.println(c2.name);
		System.out.println(c2.color);
		System.out.println(c2.age);
		System.out.println(c2.score);
		
		MyClass02 c3 = c2;
		System.out.println(c3.name);
		//필드명이 다르지만, 서로같은 클래스이기 떄문에 
		//같은 설계도 이다.
	}
}
