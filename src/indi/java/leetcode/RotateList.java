package indi.java.leetcode;

import java.util.Objects;

/**
 * Medium, Runtime: 0 ms(100.00%) Memory Usage: 38.3 MB(95.29%)
 */
public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {

		if (Objects.isNull(head) || k == 0) {
			return head;
		}

		ListNode lastNode = head;
		int l = 1;
		while (Objects.nonNull(lastNode.next)) {
			l++;
			lastNode = lastNode.next;
		}

		lastNode.next = head;

		k = l - k % l - 1;

		while (k > 0) {
			k--;
			head = head.next;
		}

		ListNode ans = head.next;
		head.next = null;

		return ans;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
