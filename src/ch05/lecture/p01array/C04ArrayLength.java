package ch05.lecture.p01array;

public class C04ArrayLength {
	public static void main(String[] args) {
		
		//참조타입 == 거의 객체
		//                 객체 :값 과 기능이 있음
		//                      필드   메소드
		//                속성:'field', attribute, property 라고 함
		
		int [] arr1 = new int [] {9, 8, 7};
		
//		//length 속성 (field, attribute, property)
		System.out.println( arr1.length ); // arr1의 배열의 갯수는 3개 
		
		//arr1의 마지막 length를 꺼내고 싶다면
		System.out.println( arr1[arr1.length - 1] );  // 7을 꺼냄
		
	}
}
