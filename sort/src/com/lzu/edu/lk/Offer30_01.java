package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 * 顺时针打印矩阵
 */
public class Offer30_01 {
	public static int[] spiralOrder(int[][] matrix) {
		if(matrix==null|| matrix.length==0||matrix[0].length==0) {
			return new int[0];
		}
		int cols=matrix.length;
		int rows=matrix[0].length;
		int total=cols*rows;
		int[][] visited=new int[cols][rows];
		int[] res=new int[cols*rows];
		int n=0,m=0,k=0;
		for(int i=0;i<=total;i++) {
			res[k++]=matrix[m][n];
			visited[m][n]=1;
		}
		return res;
    }
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[] tmp=spiralOrder(matrix);
	}
}
