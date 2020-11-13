package com.lzu.edu.lk;
public class num1003_01 {
	
	public static int search(int[] arr, int target) {
		int pos=-1;
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				pos=mid;
				break;
			}
			if(arr[mid]<target) {
				if(arr[mid]<arr[high]&&arr[high]>=target) {//右边有序
					low=mid+1;
				}else if(arr[mid]==arr[high]){
					high--;
				}else {
					high=mid;
				}
			}else {
				if(arr[mid]>arr[low]&&arr[low]<target) {
					high=mid-1;
				}else {
					low++;
				}
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1,2,1,1,1};
		int target=2;
		int tmp = search(arr, target);
	}
}
