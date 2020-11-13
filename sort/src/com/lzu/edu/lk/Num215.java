package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	基于快排的思想找第K的元素
 */
public class Num215 {
	 public static int findKthLargest(int[] nums, int k) {
		 quickSort(nums,0,nums.length-1);
		 return nums[nums.length-k];
		 
	 }
	 public static void quickSort(int arr[],int start,int end) {
		 if(start>=end) return; 
		 int basic=arr[start];
		 int low=start;
		 int high=end;
		 while(low<high) {
			 while(low<high&&arr[high]>=basic) high--;
			 arr[low]=arr[high];
			 while(low<high&&arr[low]<=basic) low++;
			 arr[high]=arr[low];
		 }
		 arr[high]=basic;
		 quickSort(arr, start,low);
		 quickSort(arr,high+1, end);
	 }
	 public static void main(String[] args) {
		int[] nums= {3,2,1,5,6,4};
		int k = 2;
		int tmp=findKthLargest(nums, k);
	}
}
