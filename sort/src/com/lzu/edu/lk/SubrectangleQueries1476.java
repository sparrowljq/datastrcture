package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author junqiangliu
 * 子矩形查询(改进)
 */
public class SubrectangleQueries1476 {
	private int[][] data;
	private List<int[]> tmplist=new ArrayList<>();
	public SubrectangleQueries1476(int[][] rectangle) {
		data=rectangle;
	}

	public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
		int[] tmp=new int[5];
		tmp[0]=row1;
		tmp[1]=col1;
		tmp[2]=row2;
		tmp[3]=col2;
		tmp[4]=newValue;
		tmplist.add(tmp);
	}

	public int getValue(int row, int col) {
		int list_size=tmplist.size();
		if(list_size>0) {
			for(int i=list_size-1;i>0;i--) {
				int[] item=tmplist.get(i);
				if(item[0]<=row&&item[2]>=row&&item[1]<=col&&item[3]>=col) {
					return item[4];
				}
			}
		}
		return data[row][col];
	}
	public static void main(String[] args) {
		String[] strs={"SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue","getValue"};
	}
}
