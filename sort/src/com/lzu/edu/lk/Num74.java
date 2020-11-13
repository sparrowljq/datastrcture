package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	二维矩阵的二分查找
 *	matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
 */
public class Num74 {
	  public static boolean searchMatrix(int[][] matrix, int target) {
		  boolean flag=false;
		  if(matrix.length==0) return flag;
		  int low=0;
		  int high=matrix.length*matrix[0].length-1;
		  while(low<=high) {
			  int mid=(low+high)/2;
			  int i=mid/matrix[0].length;
			  int j=mid-i*matrix[0].length;
			  if(matrix[i][j]==target) {
				  flag=true;
				  break;
			  }else if(matrix[i][j]<target) {
				  low=mid+1;
			  }else {
				  high=mid-1;
			  }
			  
		  }
		  return flag;
	  }
	  public static void main(String[] args) {
		int[][] matrix = {{1,3}};
		  int target = 3;
		  searchMatrix(matrix, target);
	  }
}
