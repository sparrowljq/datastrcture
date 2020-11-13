package com.lzu.edu.lk;
public class Num33 {
	public static int search(int[] nums, int target) {
		int res=-1;
		int low=0;
		int high=nums.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(nums[mid]==target) {
				res=mid;
				break;
			}
			if(nums[mid]>target) {
				if(nums[high]<nums[mid]&&nums[high]>=target) {
					low=mid+1;
				}else {
					high=mid-1;
				}
				
			}else {//目标值大于中间值
				if(target>=nums[low]&&nums[mid]<nums[low]) {
					high=mid-1;
				}else {
					low=mid+1;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
		int target=0;
		int tmp = search(nums, target);
	}
}
