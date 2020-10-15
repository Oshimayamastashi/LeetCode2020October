package indi.java.leetcode;

/**
 * Medium, Runtime: 0 ms(100.00%) Memory Usage: 39.4 MB(100.00%)
 */
public class RotateArray {

	public void rotate(int[] nums, int k) {

		int l = nums.length;

		int start = 0;
		int count = 0;
		int x = 0;
		int val = nums[0];
		while (count < l) {
			start = (start + k) % l;
			int temp = nums[start];
			nums[start] = val;
			val = temp;
			if (x == start) {
				start = (start + 1) % l;
				x = start;
				val = nums[start];
			}
			count++;
		}
	}
}
