package com.lzu.edu.lk;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {
	public int findRepeatNumber(int[] nums) {
		int res=0;
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				res=nums[i];
			}else {
				set.add(nums[i]);
			}
		}
		return res;
	}
}
