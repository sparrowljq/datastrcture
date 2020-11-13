package com.lzu.edu.lk;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Num1709 {
	public int getKthMagicNumber(int k) {
		Set<Long> set = new HashSet<>();
		PriorityQueue<Long> queue = new PriorityQueue<>();
		while (true) {
			Long tmp = queue.poll();
			if (!set.contains(tmp)) {
				queue.offer(tmp * 3);
				queue.offer(tmp * 5);
				queue.offer(tmp * 7);
				set.add(tmp);
			}
			if(set.size()==k) {
				return tmp.intValue();
			}
		}
	}
}
