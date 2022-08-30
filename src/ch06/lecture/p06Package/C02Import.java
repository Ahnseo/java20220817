package ch06.lecture.p06Package;

import java.util.Scanner;

public class C02Import {
	
	public static void main(String[] args) {
		java.util.Scanner sc1 = new java.util.Scanner("");
		//스캐너의 풀네임  java.util.Scanner 
		
		// 다른 패키지의 클래스명에서 패키지명 생략하면, import 사용
		Scanner sc2 = new Scanner(""); //import java.util.Scanner; 필요!! ㅋㅋ
		
	}
}
