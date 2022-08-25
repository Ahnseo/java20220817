package LeetCode;

import java.util.Arrays;

public class ToSum1 {
	public static void main(String[] args) {
//		Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//				You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//				You can return the answer in any order.

				 
//				Example 1:
//
//				Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
//				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//				Example 2:
//
//				Input: nums = [3,2,4], target = 6
//				Output: [1,2]
//				Example 3:
//
//				Input: nums = [3,3], target = 6
//				Output: [0,1]
		
		int target = 0;
		
		int[] a = new int[] {2,7,11,15};
		target = 9;
		System.out.println(Arrays.toString(twoSum(a, target)));;
		
		int[] b = new int[] {3,2,4};
		target = 6;
		System.out.println(Arrays.toString(twoSum(b, target)));
		
		int[] c = new int[] {3,3};
		target = 6;
		System.out.println(Arrays.toString(twoSum(c, target)));
		
	}

	private static int[] twoSum(int[] nums, int target) {
		
		int sum = 0;
		int[] result = null;
		for(int i =0; i <nums.length-1; i++) {
			sum = nums[i]+ nums[i+1];
			
			if(sum == target) {
				result = new int[] {i, i+1};
			}
		}
		return result;
		
	}
	
}
