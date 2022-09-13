package ch13.lecture.p04genericMethod;

import java.util.Arrays;
import java.util.List;

public class C02Method {
	public static void main(String[] args) {
		List<String> list1 = Arrays.<String>asList("java","spring");
		List<Integer> list2 = Arrays.<Integer>asList(99,100,101);
		
		//이클립스 타입추론이 가능하니, 이렇게 생략해서 쓴다.
		List<String> list3 = Arrays.asList("java","spring");
		List<Integer> list4 = Arrays.asList(99,100,101);
	}
	
	
	private void method1() {

	}
}
