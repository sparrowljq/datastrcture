package com.lzu.edu.lk;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Num378_01 {
	public static int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		int n=matrix.length;
		for(int i=0;i<n;i++) {
			queue.offer(new int[]{matrix[i][0],i,0});
		}
		int count=0,res=0;
		while(!queue.isEmpty()) {
			int[] tmp = queue.poll();
			count++;
			if(tmp[2]<n-1) {
				queue.offer(new int[] {matrix[tmp[1]][tmp[2]+1],tmp[1],tmp[2]+1});
			}
			if(count==k) {
				res=matrix[tmp[1]][tmp[2]];
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
//		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
//		int k = 8;
		int[][] matrix= {{-5}};
		int k=1;
		int tmp = kthSmallest(matrix, k);
	}
}
