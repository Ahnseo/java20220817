package ch16.lecture.book.s140603p716ConstructorReference.copy;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReference {
	public static void main(String[] args) {
//		                                    (s)-> new Member(s)
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel");
		System.out.println("member1.getId() : "+member1.getId());
		
		
		
//		 											(s1,s2)-> new Member(s1,s2)
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel");
		
	}
}
