package com.lzu.edu.sort.test;

public class QuickSortTest {
	public static void quickSort(int[] data,int start,int end) {
		if(start>=end) return;
		int low=start;
		int high=end;
		int stard=data[low];
		while(low<high) {
			while(low<high&&data[high]>stard) high--;
			data[low]=data[high];
			while(low<high&&data[low]<stard) low++;
			data[high]=data[low];
		}
		data[high]=stard;
		quickSort(data, start, low);
		quickSort(data, high+1, end);//每次就有一个元素位置排好了
	}
	public static void main(String[] args) {
		int[] data=new int[10];
		for(int i=0;i<10;i++) {
			data[i]=10-i;
		}
		quickSort(data,0, 9);
	}
}
