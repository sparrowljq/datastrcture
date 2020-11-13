package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 *	选择排序
 */
public class SeclectSort {
	//基本思想是每次从剩余的代排序列中选择最小元素
	public static void sort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			if(i!=minIndex) {
				int tmp=nums[i];
				nums[i]=nums[minIndex];
				nums[minIndex]=tmp;
			}
		}
	} 
	public static void main(String[] args) {
		int[] data=new int[10];
		data[1]=13;
		data[2]=5;
		data[3]=7;
		data[4]=9;
		data[5]=12;
		data[6]=8;
		data[7]=16;
		data[8]=4;
		data[9]=7;
		sort(data);
	}
}
