package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C20Collect {
	public static void main(String[] args) {
		String res = IntStream.of(9,7,1,0)
				.boxed()
				//적절한 collector를 넣어서  "9, 7, 1, 0" 리턴시켜라.
//				.map( s -> s.toString() )
				.map(String :: valueOf)
				.collect(Collectors.joining(", ")); //Integer -> String 출력하는 콜렉터를 검색해서 찾아보자.
		System.out.println(res);
				
	}
}
