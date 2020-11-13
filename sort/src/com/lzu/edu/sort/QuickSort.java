package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 * 快速排序(插入排序适合元素个数大于7的排序)
 *
 */
public class QuickSort {
	
	public static void sort(int[] arr,int start,int end) {
		if(start>=end) return;
		//选取基准值
		int stard=arr[start];
		int low=start;
		int high=end;
		while(low<high) {
			while(low<high&&stard<=arr[high]) high--;
			arr[low]=arr[high];
			while(low<high&&arr[low]<=stard) low++;
			arr[high]=arr[low];
		}
		arr[high]=stard;
		sort(arr,start,low);
		sort(arr,high+1, end);
	}
	public static void main(String[] args) {
		int[] data=new int[10];
		for(int i=0;i<10;i++) {
			data[i]=10-i;
		}
		sort(data,0, 9);
	}
}
