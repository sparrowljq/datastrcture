package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	二维数组中查找数
 */
public class Offer04 {
	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		boolean flag=false;
		if(matrix.length==0) return flag;
		int j=matrix[0].length-1;
		int i=0;
		while(i<matrix.length&&j>=0) {
			if(matrix[i][j]==target) {
				flag=true;
				break;
			}
			if(matrix[i][j]<target) {
				i++;
			}else {
				j--;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[][] matrix= {
//		                {1,   4,  7, 11, 15},
//		                {2,   5,  8, 12, 19},
//		                {3,   6,  9, 16, 22},
//		                {10, 13, 14, 17, 24},
//		                {18, 21, 23, 26, 30}
				{-5}
		};
		int target=-5;
		findNumberIn2DArray(matrix, target);
		        
	}
}
