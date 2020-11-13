package com.lzu.edu.lk;

import java.util.PriorityQueue;
/**
 * 
 * @author junqiangliu
 *	输出无序列表中的k小元素
 */
public class Offer40 {
	//用堆的思想做
	public static int[] getLeastNumbers(int[] arr, int k) {
		int[] res=new int[k];
		int count=0;
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		for(int item:arr) {
			queue.add(item);
		}
		while(k>0) {
			res[count++]=queue.poll();
			k--;
		}
		return res;
	}
	//用快排思想做
	public static int[] getLeastNumbers1(int[] arr, int k) {
		int pos=getpos(arr,0,arr.length-1, k);
		int[] res=new int[pos+1];
		for(int i=0;i<=pos;i++) {
			res[i]=arr[i];
		}
		return res;
	}
	public static int getpos(int[] arr,int start,int end,int k) {
		if(k==0) return -1;
		int low=start;
		int high=end;
		int stard=arr[start];
		while(low<high) {
			while(low<high&&arr[high]>=stard) high--;
			arr[low]=arr[high];
			while(low<high&&arr[low]<=stard) low++;
			arr[high]=arr[low];
		}
		arr[high]=stard;
		if(high==k-1) {
			return high;
		}else if(high<k-1){
			return getpos(arr,high+1, end, k);
		}else {
			return getpos(arr, start, high-1, k);
		}
	}
	public static void main(String[] args) {
		int[] arr= {0,0,1,2,4,2,2,3,1,4};
		int k=8;
		int[] tmp = getLeastNumbers1(arr, k);
	}
}
