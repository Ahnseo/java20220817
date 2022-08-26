package ch06.lecture.p03Method;

public class MyClass04 {
	
	//메소트 리턴 타입 : 메소드 내에서 반환하는 값의 타입
	//단, void는 리턴 값이 없는 의미
	void method1() {
		//return 이란: 메소드 종료, 값 반환
	}
	
	int method2() {
		return 3; // x
	}
	
	int method3() {
		return 5;
	}
	
	int method4() {
		int a =3;
		if(a==3) {
			return 10;
		// false면, 컴퓨터가 return 값을 만나지않을수있다고 판단해서 오류날수있음
		}
		return 9;
	}
	
}
