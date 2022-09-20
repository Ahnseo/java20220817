package ch16.lecture.p02stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C21GroupingBy {
	public static void main(String[] args) {
		
		// groupingBy(그룹핑): 리턴 map 
		
		// groupingBy​(Function<? super T,​? extends K> classifier)  : 해석..Function<? super T,​? extends K>타입의
		// 리턴 static <T,​K>Collector<T,​?, ​Map<K,​List<T>>> : 해석.. 리턴 스태틱 map타입
		// 
		
		
		// 지금은 홀짝으로 분류하고자 한다. 
		// T =>key(Integer) , R => value(String) 
		Map<String, List<Integer>> map = IntStream.of(3,5,2,4,9,10)
										.boxed() // 리턴 Stream<Integer> , .boxed()를 마우스 호버 확인해보자
										.collect(Collectors.groupingBy((e) -> (e%2==0) ? "짝수 " : "홀수 "));
		
		System.out.println(map);
		
		
	}
}
