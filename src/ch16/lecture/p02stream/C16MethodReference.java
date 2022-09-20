package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		int maxVal1 = IntStream.of(3,9,1,0,10)
				.boxed()
//				.max((x,y) -> x.compareTo(y))
				.max(Integer::compareTo) //순서가 같기때문에 (MethodReference)  :: 사용가능
				.get();
		System.out.println(maxVal1);
		
		
		int maxVal2 = IntStream.of(3,9,10,0,1)
				.boxed()
//				.max((x,y) -> x.compare(x,y))
				.max(Integer::compare) //순서가 같기때문에 (MethodReference)  :: 사용가능
				.get();
		System.out.println(maxVal2);
	}
}
