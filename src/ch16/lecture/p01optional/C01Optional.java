package ch16.lecture.p01optional;

import java.util.Optional;

public class C01Optional {
	public static void main(String[] args) {
		
		//Optional class : 컨테이너에 element가 있는지 없는지 ,return boolean  
		
		Optional<String> obj1 = Optional.empty();
		Optional<String> obj2 = Optional.of("java");
		
		System.out.println(obj1.isEmpty()); // true
		System.out.println(obj2.isEmpty()); // false
		
		System.out.println(obj1.isPresent()); // false
		System.out.println(obj2.isPresent()); // true
		
		String str2 = obj2.get();
		System.out.println(str2);
		
//		String str1 = obj1.get();
//		System.out.println(str1);
		
		String str1 = obj1.orElse("emtpy string");
		System.out.println(str1);
		System.out.println(obj2.orElse("empty string"));
	}
}
