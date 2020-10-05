package indi.java.leetcode;

/**
 * Easy, Runtime: 0 ms(100.00%) Memory Usage: 35.8 MB(95.83%)
 */
public class ComplementOfBase10Integer {

	public int bitwiseComplement(int N) {
		String binaryString = Integer.toBinaryString(N);

		int sum = 0;
		for (char c : binaryString.toCharArray()) {
			if (c == '0') {
				sum = sum * 2 + 1;
			} else {
				sum *= 2;
			}
		}

		return sum;
	}
}
