package com.lzu.edu.lk;

public class Num1003 {
	public static int search(int[] arr, int target) {
		int m=0;
		int max=Integer.MIN_VALUE;
		while(m<arr.length) {
			if(arr[m]>max) {
				max=arr[m];
				m++;
			}else {
				break;
			}
		}
		int p1=find(arr, 0,m, target);
		int p2=find(arr,m+1,arr.length-1, target);
		if(p1==Integer.MAX_VALUE&&p2==Integer.MAX_VALUE) {
			return -1;
		}else {
			return Math.min(p1, p2);
		}
	}
	public static int find(int[] data,int start,int end,int target) {
		int pos=Integer.MAX_VALUE;
		int low=start;
		int high=end;
		if(high<low) return pos;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(data[mid]==target) {
				pos=mid;
				break;
			}else if(data[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return pos;
	}
	public static void main(String[] args) {
		int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		int target = 5;
		int tmp = search(arr, target);
	}
}
