package indi.java.leetcode;

import java.util.Arrays;

/**
 * Medium, Runtime: 4 ms(97.46%) Memory Usage: 39.5 MB(76.90%)
 */
public class RemoveCoveredIntervals {

	public int removeCoveredIntervals(int[][] intervals) {
		int ans = intervals.length;
		Arrays.sort(intervals, (i1, i2) -> {
			if (i1[0] == i2[0]) {
				return i2[1] - i1[1];
			}
			return i1[0] - i2[0];
		});
		int right = -1;
		for (int[] interval : intervals) {
			if (interval[1] <= right) {
				ans--;
			} else {
				right = interval[1];
			}
		}

		return ans;
	}
}
