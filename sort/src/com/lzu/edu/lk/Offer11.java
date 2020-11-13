package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 寻找旋转数组中的最小值
 */
public class Offer11 {
	public int minArray(int[] numbers) {
		int res=Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<res) {
				res=numbers[i];
			}
		}
		return res;
	}
	public static int minArray1(int[] numbers) {
		int low=0;
		int high=numbers.length-1;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(numbers[mid]>numbers[high]) {
				low=mid+1;
			}else if (numbers[mid]==numbers[high]) {
				high--;
			}else {
				high=mid;
			}
		}
		return numbers[low];
	}
	public static void main(String[] args) {
		int[] numbers= {3,1,3};
		int tmp = minArray1(numbers);
	}
}
