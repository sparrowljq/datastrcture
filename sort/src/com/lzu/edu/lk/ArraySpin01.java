package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	通过辅助空间来移动
 */
public class ArraySpin01 {
	public void rotate(int[] nums, int k) {
		int[] data=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			//
			data[(i+k)%nums.length]=nums[i];
		}
		for(int i=0;i<data.length;i++) {
			nums[i]=data[i];
		}
	}
	public static void main(String[] args) {
		int[] data= {1,2,3,4,5,6,7};
		ArraySpin01 ss=new ArraySpin01();
		ss.rotate(data, 3);
	}
}
