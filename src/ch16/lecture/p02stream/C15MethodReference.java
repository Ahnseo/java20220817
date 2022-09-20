package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.List;

public class C15MethodReference {
	public static void main(String[] args) {
		// :: MethodReference  
		
		String[] arr1 = {"ironman", "cap", "widow", "hurk", "panther"};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//이렇게 람다식으로도 같은 일을 한다.
		Arrays.sort(arr1, (a,b) ->a.compareTo(b));
		System.out.println(Arrays.toString(arr1));
		
		// :: 으로도 같은 일을 한다.
		Arrays.sort(arr1, String::compareTo); //MethodReference
		System.out.println(Arrays.toString(arr1));
		
		//순서를 거꾸로할때는 :: MethodReference 사용할수없다. 
		//(a,b) ->a.compareTo(b) 이렇게 같은 순서일때만 MethodReference 사용가능하다.
	}
}
