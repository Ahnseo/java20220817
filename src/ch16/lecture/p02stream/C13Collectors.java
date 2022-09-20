package ch16.lecture.p02stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C13Collectors {
	public static void main(String[] args) {
		List<Integer> list = IntStream.range(1,100)
							.filter(n->n%2 ==0)
							.boxed()
							.collect(Collectors.toList());
		System.out.println(list);
		
		//연습예제 exercise.p7
	}
}
