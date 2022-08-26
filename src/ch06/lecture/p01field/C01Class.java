package ch06.lecture.p01field;

public class C01Class {
	public static void main(String[] args) {
		String a = new String("java");
		
		//나만의 객체를 만들고 싶을때,
		MyObject c1 = new MyObject(); 
		MyObject c2 = new MyObject(); 
		//이때, 서로 다른 인스턴스로 만들어짐
	}
}

// class : 객체 설계도 (청사진)
// class 클레스명 {클래스 바디};ㅊ
//       클래스명 작성 관습 : UpperCamelCase  

// class 작성위치 : 하나의 클래스는 하나의 파일로 분리
class MyObject{
	
}