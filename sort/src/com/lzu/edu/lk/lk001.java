package com.lzu.edu.lk;

public class lk001 {
	public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int i;
        for(i=0;i<nums.length;i++) {
        	int tmp=target-nums[i];
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[j]==tmp) {
        			res[0]=i;
        			res[1]=j;
        			break;
        		}
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		int[] nums= {3, 2, 4};
		int target=6;
		int[] res=twoSum(nums, target);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
}
