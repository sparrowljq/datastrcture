package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 * 通过字符旋转的方法来做
 *
 */

public class ArraySpin02 {
	public static void rotate(int[] nums,int k) {
		k=k%nums.length;
		reverse(nums,0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k,nums.length-1);
	}
	public static void reverse(int[] nums,int start,int end) {
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
}
