package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 *	三数取中优化
 */
public class QuickSort1 {
	public static void sort(int[] arr,int start,int end) {
		if(start>=end) return;
		//选取基准值
		int stard;
		int low=start;
		int high=end;
		//三数取中优化
		int mid=low+(high-low)/2;
		if(arr[low]>arr[high]) {
			swap(arr,low,high);
		}
		if(arr[mid]>arr[high]) {
			swap(arr,mid, high);
		}
		if(arr[mid]>arr[low]) {
			swap(arr,mid,low);
		}
		stard=arr[low];
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
	//元素位置交换
	public static void swap(int[] data,int i,int j) {
		int tmp=data[i];
		data[i]=data[j];
		data[j]=tmp;
	}
	public static void main(String[] args) {
		int[] data=new int[10];
		for(int i=0;i<10;i++) {
			data[i]=10-i;
		}
		sort(data,0, 9);
	}
}
