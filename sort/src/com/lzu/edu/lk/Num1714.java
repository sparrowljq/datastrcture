package com.lzu.edu.lk;

import java.util.PriorityQueue;
import java.util.Queue;

public class Num1714 {
	public static int[] smallestK(int[] arr, int k) {
		Queue<Integer> queue=new PriorityQueue<>();
		int[] res=new int[k];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			queue.offer(arr[i]);
		}
		while(count<k) {
			res[count++]=queue.poll();
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,2,4,6,8};
		int k=4;
		int[] tmp = smallestK(arr, k);
	}
}
