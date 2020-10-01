package indi.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Easy, Runtime: 17 ms(99.32%) Memory Usage: 47.9 MB(84.26%)
 */
public class NumberOfRecentCalls {

	public static void main(String[] args) {
		RecentCounter recentCounter = new RecentCounter();
		System.out.println(recentCounter.ping(1)); // requests = [1], range is [-2999,1], return 1
		System.out.println(recentCounter.ping(100)); // requests = [1, 100], range is [-2900,100], return 2
		System.out.println(recentCounter.ping(3001)); // requests = [1, 100, 3001], range is [1,3001], return 3
		System.out.println(recentCounter.ping(3002)); // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
	}

}

class RecentCounter {

	public static final int PAST_SECOND = 3000;

	private int begin;

	private List<Integer> request;

	public RecentCounter() {
		this.begin = 0;
		request = new ArrayList<>();
	}

	public int ping(int t) {
		request.add(t);
		int end = request.size();

		while (request.get(begin) < t - PAST_SECOND) {
			begin++;
		}

		return end - begin;
	}
}