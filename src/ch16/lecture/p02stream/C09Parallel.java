package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("a","b","c","d","e");
		
		//parallelStream :여러 데이터 흐름이 생성되고, 순서가 보장되지 않음.
		list1.parallelStream().forEach((e) -> System.out.println(e));
		System.out.println();
		
		//순서를 보장시키려면, forEachOrdered() 
		list1.parallelStream().forEachOrdered((e) -> System.out.println(e));
	}
}
