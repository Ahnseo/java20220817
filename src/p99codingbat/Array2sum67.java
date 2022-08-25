package p99codingbat;

public class Array2sum67 {
	public static void main(String[] args) {
//		Return the sum of the numbers in the array, 
//		except ignore sections of numbers starting with a 6 and extending to the next 7 
//		(every 6 will be followed by at least one 7). Return 0 for no numbers.

		int[] a = { 1, 2, 2 };
		int[] b = { 1, 2, 2, 6, 99, 99, 7 };
		int[] c = { 1, 1, 6, 7, 2, 99, 6, 100, 7, 99 };

		System.out.println(sum67(a)); // → 5
		System.out.println(sum67(b)); // → 5
		System.out.println(sum67(c)); // → 4

		//  이중 for문은 안되겠따... 힘들다.. 접근방법이 잘못된듯하다...
		// 선생님 방법으로 해야겟다..
	}

	public static int sum67(int[] nums) {

		int totalSum = 0;
		int sumBetween67 = 0;

		for (int i = 0; i < nums.length; i++) {
			// 그냥 전체 합
//			totalSum = nums[i];

			
			// 6~7값의 합을 구하고싶다.
			if (nums[i] == 6) { // 값이 6일때 , 길이 0 부터 k 순번 미만까지 반복(for)하여 더한다. //그래야 6값 포함 안한다.
				
				for (int k = 0; k < nums[i].length ; k++) // 배열 길이를 어떻게 맞나... 2번 일수도 3번일수도있는데;
					sumBetween67 += nums[k];
			}
		}

		return totalSum - sumBetween67;
	}

}


----------    -----               ok
-------------------     -------
