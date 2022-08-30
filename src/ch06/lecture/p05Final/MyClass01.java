package ch06.lecture.p05Final;

import ch06.lecture.p01field.MyClass03;

public class MyClass01 {
	//static final : 상수  :항상 일정한 값
    //상수명 작성관습 : UPPER_SNAKE_CASE
	
	static final int ABC = 9999;
	static final int DEF_GHI = 100000;
	static final int DEF_GHI_JKL = 9999999;
	
	final int a = 5;
	final int b;
	
	public MyClass01(){ 
		b = 9;
	}
	MyClass01(int b){
		this.b = b; // 꼭한번 초기화해야함
	}
	MyClass01(int c, int d) {
		this.b = 999;
	}
}
