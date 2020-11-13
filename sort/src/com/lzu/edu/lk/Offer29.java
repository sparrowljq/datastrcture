package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 * 顺时针打印矩阵
 */
public class Offer29 {
	public static int[] spiralOrder(int[][] matrix) {
		if(matrix==null|| matrix.length==0||matrix[0].length==0) {
			return new int[0];
		}
		int rows=matrix.length;
		int cols=matrix[0].length;
		int left=0;
		int top=0;
		int right=cols-1;
		int bottom=rows-1;
		int index=0;
		int[] res=new int[rows*cols];
		while(top<=bottom&&left<=right) {
			//从左到右遍历
			for(int i=left;i<=right;i++) {
				res[index++]=matrix[top][i];
			}
			//从上到下遍历
			for(int i=top+1;i<=bottom;i++) {
				res[index++]=matrix[i][right];
			}
			if(left<right&&top<bottom) {
				//从右到左
				for(int i=right-1;i>=left;i--) {
					res[index++]=matrix[bottom][i];
				}
				//从下到上
				for(int i=bottom-1;i>top;i--) {
					res[index++]=matrix[i][left];
				}
			}
			top++;
			left++;
			right--;
			bottom--;
		}
		return res;
    }
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[] tmp=spiralOrder(matrix);
	}
}
