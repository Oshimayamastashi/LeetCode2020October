package indi.java.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Easy, Runtime: 0 ms(100%) Memory Usage: 38.9 MB
 */
public class BuddyStrings {

	public boolean buddyStrings(String A, String B) {

		if (A.length() != B.length()) {
			return false;
		}

		char[] aCharArray = A.toCharArray();

		if (A.equals(B)) {
			return dealWithEquals(aCharArray);
		}

		char[] bCharArray = B.toCharArray();
		int first = -1;
		int second = -1;
		for (int i = 0; i < aCharArray.length; ++i) {
			if (aCharArray[i] != bCharArray[i]) {
				if (first == -1) {
					first = i;
				} else if (second == -1) {
					second = i;
				} else {
					return false;
				}
			}
		}

		return (second != -1 && aCharArray[first] == bCharArray[second] && aCharArray[second] == bCharArray[first]);

	}

	private boolean dealWithEquals(char[] aCharArray) {
		Set<Character> letterSet = new HashSet<>();
		for (int i = 0; i < aCharArray.length; i++) {
			if (letterSet.contains(aCharArray[i])) {
				return true;
			} else {
				letterSet.add(aCharArray[i]);
			}
		}
		return false;
	}

}
