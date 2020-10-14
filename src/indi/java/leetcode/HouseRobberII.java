package indi.java.leetcode;

/**
 * Medium, Runtime: 0 ms Memory Usage: 36.1 MB
 */
public class HouseRobberII {

	public int rob(int[] nums) {

		int n = nums.length;
		if (n < 3) {
			int max = 0;
			for (int num : nums) {
				if (num > max) {
					max = num;
				}
			}

			return max;
		}

		// 1 - n-1
		int[] dp = new int[n];

		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length - 1; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}

		int ans1 = dp[nums.length - 2];
		// 2 - n
		dp[1] = nums[1];
		dp[2] = Math.max(nums[1], nums[2]);
		for (int i = 3; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}

		int ans2 = dp[nums.length - 1];

		return Math.max(ans1, ans2);
	}

}
