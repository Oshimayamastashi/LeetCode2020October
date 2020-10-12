package indi.java.leetcode;

/**
 * Medium, Runtime: 1 ms(100%) Memory Usage: 38.9 MB
 */
public class RemoveDuplicateLetters {

	public String removeDuplicateLetters(String s) {

		StringBuilder sb = new StringBuilder();
		int[] charCount = new int[26];
		boolean[] visit = new boolean[26];

		for (char c : s.toCharArray()) {
			int i = c - 'a';
			charCount[i] = charCount[i] + 1;
		}

		char[] stack = new char[26];
		int last = -1;
		for (char c : s.toCharArray()) {
			int i = c - 'a';
			charCount[i]--;

			if (!visit[i]) {
				while (last >= 0) {
					char cur = stack[last];
					if (c < cur && charCount[cur - 'a'] > 0) {
						visit[cur - 'a'] = false;
						last--;
					} else {
						break;
					}
				}
				stack[++last] = c;
				visit[i] = true;
			}
		}

		for (int i = 0; i <= last; i++) {
			sb.append(stack[i]);
		}

		return sb.toString();
	}

}
