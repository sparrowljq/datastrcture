package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 有序矩阵中第K小的元素
 */
public class Num378 {

	public static int kthSmallest(int[][] matrix, int k) {
		int n=matrix.length;
		int low=matrix[0][0];
		int high=matrix[n-1][n-1];
		while(low<high) {
			int mid=low+(high-low)/2;
			if(cheaknum(matrix, k, mid, n)) {//数量大于k,但是还有可能是元素相同的情况
				high=mid;
			}else {
				low=mid+1;
			}
		}
		return low;
	}
	public static boolean cheaknum(int[][] matrix,int k,int mid,int n) {
		int i=n-1;
		int j=0;
		int num=0;
		while(i>=0&&j<n) {
			if(matrix[i][j]<=mid) {
				num+=i+1;
				j++;
			}else {
				i--;
			}
		}
		return num>=k;
	}

	public static void main(String[] args) {
//		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
//		int k = 8;
		int[][] matrix= {{1,2},{1,3}};
		int k=3;
//		int[][] matrix= {{-5}};
//		int k=1;
//		int [][] matrix= {{2000000000}};
		kthSmallest(matrix, k);
		
	}
}
