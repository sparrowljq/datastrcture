package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu
 * 子序列
 */
public class SubrectangleQueries {
	private int[][] data;
	public SubrectangleQueries(int[][] rectangle) {
		data=rectangle;
	}

	public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
		for(int i=row1;i<=row2;i++) {
			for(int j=col1;j<=col2;j++) {
				data[i][j]=newValue;
			}
		}
	}

	public int getValue(int row, int col) {
		return data[row][col];
	}
	public static void main(String[] args) {
		String[] strs={"SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue","getValue"};
	}
}
