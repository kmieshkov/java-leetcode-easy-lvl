/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.


Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

 */

import java.util.Arrays;

public class TwoSum {

	/********************** 1 Solution ********************************/

//	public static int[] twoSum(int[] nums, int target) {
//
//		for(int i = 0; i < nums.length; i++) {
//			for(int j = 0; j < nums.length; j++) {
//				if (i != j && (nums[i] + nums[j] == target)) {
//					return new int[] {i, j};
//				}
//			}
//		}
//		return new int[] {};
//	}

	/********************** 2 Solution ********************************/

	public static int searchIndex(int[] array, int needle, int j) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == needle && i != j) {
				return i;
			}
		}
		return -1;
	}

	public static int[] twoSum(int[] nums, int target) {

		int j;
		int k;
		int[] res = new int[2];
		for(int i = 0; i < nums.length; i++) {
			j = target - nums[i];
			k = searchIndex(nums, j, i);
			if (k > 0 && i != k) {
				res[0] = i;
				res[1] = k;
			}
		}
		return res;
	}

	public static void main(String[] args) {
//		int[] nums = {2,7,11,15};
//		int target = 9;

		int[] nums = {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}
