package com.lzu.edu.lk;

public class Offer45 {
	public static String minNumber(int[] nums) {
		String res="";
		quickSort(nums,0,nums.length-1);
		for(int i=0;i<nums.length;i++) {
			res+=nums[i];
		}
		return res;
    }
	public static void quickSort(int[] nums,int start,int end) {
		if(start>=end) return;
		int low=start;
		int tmp=nums[low];
		String basic=tmp+"";
		int high=end;
		while(low<high) {
			while(low<high&&(nums[high]+basic).compareTo(basic+nums[high])>=0) high--;
			nums[low]=nums[high];
			while(low<high&&(nums[low]+basic).compareTo(basic+nums[low])<=0) low++;
			nums[high]=nums[low];
		}
		nums[high]=tmp;
		quickSort(nums, start,low);
		quickSort(nums,high+1, end);
	}
	public static void main(String[] args) {
		int[] nums= {1,1,1};
		System.out.println(minNumber(nums));
	}
}
