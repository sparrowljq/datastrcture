package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	二分查找
 */
public class Num704 {
	 public static int search(int[] nums, int target) {
		 int pos=-1;
		 int low=0;
		 int high=nums.length-1;
		 while(low<=high) {
			 int mid=(low+high)/2;
			 if(nums[mid]==target) {
				 pos=mid;
				 break;
			 }else if(nums[mid]<target) {
				 low=mid+1;
			 }else {
				 high=mid-1;
			 }
		 }
		 return pos;
	 }
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		int pos=search(nums, target);
	}
}
