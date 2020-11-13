package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	面试题10.09
 */
public class Num1009_01 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		boolean flag=false;
		int n=matrix.length;
		if(n==0) return false;
		int m=matrix[0].length;
		int i=0,j=m-1;
		while(i<n&&j>0) {
			if(matrix[i][j]>target) {
				j--;
			}else if(matrix[i][j]==target){
				flag=true;
				break;
			}else {
				i++;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
//		[
//		  [1,   4,  7, 11, 15],
//		  [2,   5,  8, 12, 19],
//		  [3,   6,  9, 16, 22],
//		  [10, 13, 14, 17, 24],
//		  [18, 21, 23, 26, 30]
//		]
//		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
//				{ 18, 21, 23, 26, 30 } };
//		int target=20;
		int[][] matrix= {{1,1}};
		int target=-2;
		boolean tmp = searchMatrix(matrix, target);
	}
}
