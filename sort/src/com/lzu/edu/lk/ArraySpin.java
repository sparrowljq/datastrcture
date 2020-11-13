package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	数组旋转（时间超出）
 */
public class ArraySpin {
	public void rotate(int[] nums, int k) {
		if(nums.length>1) {
			for(int n=0;n<k;n++) {
				int tmp=nums[0];
				for(int i=nums.length-1;i>0;i--){
					nums[(i+1)%nums.length]=nums[i];
				}
				nums[1]=tmp;
			}
		}
	}
	public static void main(String[] args) {
		int[] data= {1,2,3,4,5,6,7};
		ArraySpin aSpin=new ArraySpin();
		aSpin.rotate(data, 3);
	}
}
