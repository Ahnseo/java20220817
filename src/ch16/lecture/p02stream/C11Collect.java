package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C11Collect {
	public static void main(String[] args) {
		//Collect() : 종료연산 
		// 			stream에 있는 elements 를 지정된 container에 수집하는 일을함.
		//param1:  컨테이너( 원소가 들어갈 )
		//param2 : 컨테이너에 원소를 넣는 일
		//param3 : 여러 컨테이너 병합하는일
		
		List<Integer> list1 = IntStream.range(1, 100)
							.filter(n -> n%2 == 0)
							.collect(()-> new ArrayList<>(), (c,e)->c.add(e), (c1,c2)-> c1.addAll(c2));
		
		System.out.println(list1);
			
		//더 쉽게 Collector interface , *** Collectors class ***  
					
		
	}
}
