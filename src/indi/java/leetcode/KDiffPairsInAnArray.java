package indi.java.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Medium, Runtime: 14 ms(28.43%) Memory Usage: 47.2 MB(18.30%)
 * 
 * this solution is O(n) but run slower than use sort O(nlogn) & two pointer O(n)
 */
public class KDiffPairsInAnArray {

	public int findPairs(int[] nums, int k) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int ans = 0;

		for (int num : nums) {
			int t1 = num - k;
			int t2 = num + k;
			if (Objects.nonNull(set1.contains(t1)) && !set2.contains(t1)) {
				set2.add(t1);
				ans++;
			}

			if (Objects.nonNull(set1.contains(t2)) && !set2.contains(num)) {
				set2.add(num);
				ans++;
			}

			set1.add(num);
		}

		return ans;
	}
}
