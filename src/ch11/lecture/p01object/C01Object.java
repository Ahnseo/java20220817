package ch11.lecture.p01object;

import java.util.Scanner;

public class C01Object {
	//api 사용방법 배우는중..
	
	public static void main(String[] args) {
		//Object : 모든 클래스의 상위 클래스 이기때문
		Object o1 = "string";
		Object o2 = new Scanner("hahaha");
		Object o3 = new ArrayIndexOutOfBoundsException();
		Object o4 = new int [] {3,4,5};
		Object o5 = new String[] {"ahn","seo","jung"};
		
		//심지어 기본타입도 대입 가능
		Object o6 = 3; //integer  까지 됨..
		Object o7 = true;
		Object o8 = 3.14;
		 
		//ㅎㅎ.. 이런것까지 ..
		Object[] o9 = {"striing",
					new int[] {3,4},
					new ArrayIndexOutOfBoundsException(),
					3,
					true
		};
	}
}
