package LeetCode;

import java.util.Arrays;
import java.util.stream.Stream;

public class PalindromeNumber9 {
	public static void main(String[] args) {
//		Given an integer x, return true if x is palindrome integer.
//		An integer is a palindrome when it reads the same backward as forward.
//		For example, 121 is a palindrome while 123 is not.
//				 
//
//		Example 1:
//		Input: x = 121
//		Output: true
//		Explanation: 121 reads as 121 from left to right and from right to left.

//		Example 2:
//		Input: x = -121
//		Output: false
//		Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//		Example 3:
//		Input: x = 10
//		Output: false
//		Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

		// 3자리수 이여야하구나. 아니, 홀수 자리 이여야하구나 . 짝수=false

		// 홀수 자리 일때, 첫자리와 끝자리 숫자가 같아야하구나., 아니지. 12321 배열로 보면, array[0]
		// =array[array.lenth-1] 이구나.

		// integer => 배열로 바꿀수있나?

//		boolean result = false;
//		int x = 31243;
//		int[] digits = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
//        System.out.println( Arrays.toString(digits) ); //[1,2,1]
//        
//        for(int i =0; i < digits.length; i++) {
//        	
//        		
//	        	if(digits[i] == digits[digits.length -i -1] ) {
//	        		result = true;
//	        	}else
//	        		result = false;
//        
//        }
//        System.out.println("1번 답 : " + result);

		
		// palindrome  확인식
		// temp, sum, % , /  이용  
		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
