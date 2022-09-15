package ch15컬렉션프레임워크.lecture.p02set;

import java.util.HashSet;

import java.util.Set;

public class C04SetEquals {
	public static void main(String[] args) {
		//element가 같은지 판단하려면, equals 메소드
		
		Set<String> set = new HashSet<String>();
		System.out.println(set.add("java")); //t
		set.add("css");
		set.add("java"); //중복 안들어감
		System.out.println(set.add(new String("java"))); //f 출력 //중복 안들어감

	}
}
