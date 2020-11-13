package com.lzu.edu.lk;

import java.util.Arrays;

public class num475 {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(heaters);
		int res=0;
		for(int house:houses) {
			int index=housesPos(house, heaters);
			if(index<0) {
				index=-(index+1);
				int leftpos= index-1>=0? house-heaters[index-1]:Integer.MAX_VALUE;
				int rightpos = index<heaters.length?heaters[index]-house:Integer.MAX_VALUE;
				res=Math.max(res,Math.min(leftpos,rightpos));
			}
		}
		return res;
	}
	public int housesPos(int house,int[] heaters) {
		int low=0;
		int high=heaters.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(heaters[mid]>house) {
				high=mid-1;
			}else if(heaters[mid]<house) {
				low=mid+1;
			}else {
				return mid;
			}
		}
		return -(low+1);
	}
}
