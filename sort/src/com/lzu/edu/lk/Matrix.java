package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	矩阵转置
 */
public class Matrix {
	public static int[][] transpose(int[][] A) {
		int[][] res=new int[A[0].length][A.length];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				res[j][i]=A[i][j];
			}
		}
		return res;
    }
	public static void main(String[] args) {
		int[][] data= {{1,2,3},{4,5,6}};
		int[][] tmp=transpose(data);
	}
}
