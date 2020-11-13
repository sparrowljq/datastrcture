package com.lzu.edu.lk;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * @author junqiangliu
 *
 */
public class Num1439 {
	public static int kthSmallest(int[][] mat, int k) {
		int count=0;
		Queue<Integer> queue=new PriorityQueue<>();
		int m=mat.length;
		int n=mat[0].length;
		
		while(count<k-1) {
			queue.poll();
			count++;
		}
		return queue.poll();
	}
	public static void main(String[] args) {
		int[][] mat = {{1,3,11},{2,4,6}};
		int k = 5;
		int tmp = kthSmallest(mat, k);
	}
}
