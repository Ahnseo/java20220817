package ch06.lecture.p06Package;

public class C01Package {
	//class full name
	ch06.lecture.p06Package.MyClass01 c1 = new ch06.lecture.p06Package.MyClass01();
	
	ch06.lecture.p05Final.MyClass01 c2 = new ch06.lecture.p05Final.MyClass01();
	
	// 같은 패키지에서 사용될때, 클래스의 패키지명 생략 가능
	MyClass01 c3 = new MyClass01();
	// 다른패키지에서 불러올때는, full name 으로 불러오기...
	// 하지만 생각 가능한 경우가 있음...... C02Import 파일에서 알아보자..
}
