package indi.java.leetcode;

/**
 * Medium, Runtime: 0 ms(100.00%) Memory Usage: 38.1 MB
 */
public class SearchA2DMatrix {

	public static void main(String[] args) {
		int[][] arr = { {} };
		searchMatrix(arr, 1);
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int t = matrix.length - 1;

		while (t >= 0) {
			if (0 < matrix[t].length && matrix[t][0] <= target) {
				break;
			}
			t--;
		}

		if (t >= 0) {
			for (int i = 0; i < matrix[t].length; i++) {
				if (target == matrix[t][i]) {
					return true;
				} else if (target < matrix[t][i]) {
					break;
				}
			}
		}

		return false;
	}

}
