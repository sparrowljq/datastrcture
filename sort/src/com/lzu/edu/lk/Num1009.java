package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	面试题10.09
 */
public class Num1009 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		boolean flag=false;
		if(matrix.length==0) return flag;
		int low_i=0,low_j=0;
		int high_i=matrix.length-1;
		int high_j=matrix[0].length-1;
		if(low_i==high_j&&matrix[low_i][high_j]==target) {
			flag=true;
		}
		while(low_i<high_i&&low_j<high_j) {
			int mid_i=low_i+(high_i-low_i)/2;
			int mid_j=low_j+(high_j-low_j)/2;
			if(matrix[high_i][mid_j]>target) {//目标元素可能在小矩型内
				high_j=mid_j;
				if(matrix[mid_i][high_j]==target) {
					flag=true;
					break;
				}else if(matrix[mid_i][high_j]>target) {
					high_i=mid_i;
				}else {
					low_i=mid_i;
				}
			}else {
				low_j=mid_j;
				if(matrix[mid_i][high_j]==target) {
					flag=true;
					break;
				}else if(matrix[mid_i][high_j]>target) {
					high_i=mid_i;
				}else {
					low_i=mid_i;
				}
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
