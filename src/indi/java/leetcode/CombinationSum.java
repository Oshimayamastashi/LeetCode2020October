package indi.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium, Runtime: 2 ms(99.33%) Memory Usage: 39.3 MB(95.30%)
 */
public class CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> ans = new ArrayList<>();
		dfsFindComb(ans, candidates, new ArrayList<>(), target, 0);

		return ans;
	}

	private void dfsFindComb(List<List<Integer>> ans, int[] candidates, List<Integer> current, int target, int start) {

		if (target == 0) {
			List<Integer> arr = new ArrayList<>(current);
			ans.add(arr);
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (target >= candidates[i]) {
				current.add(candidates[i]);
				dfsFindComb(ans, candidates, current, target - candidates[i], i);
				current.remove(current.size() - 1);
			}
		}
	}
}
