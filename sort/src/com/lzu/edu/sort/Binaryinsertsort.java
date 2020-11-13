package com.lzu.edu.sort;

/**
 * 
 * @author junqiangliu 折半插入排序
 */
public class Binaryinsertsort {
	public static void main(String[] args) {
		// 声明数据 第一个数据用来设置监视哨
		int[] data = new int[6];
		data[0] = 0;
		data[1] = 38;
		data[2] = 49;
		data[3] = 24;
		data[4] = 32;
		data[5] = 30;
		int[] res = bInsertSort(data);
		for (int k = 1; k < res.length; k++) {
			System.out.println(res[k]);
		}
	}
	//折半查找排序
	public static int[] bInsertSort(int[] data) {
		for(int i=2;i<data.length;i++) {
			if(data[i]<data[i-1]) {
				data[0]=data[i];
				int low=1,high=i-1;
				//通过折半查找寻找要插入的位置
				while(high>=low) {
					int m=(high+low)/2;
					if(data[m]>data[0]) {
						high=m-1;
					}else {
						low=m+1;
					}
				}
				//移动元素
				for(int j=i-1;j>=high+1;j--) {
					data[j+1]=data[j];
				}
				data[high+1]=data[0];
			}
		}
		return data;
	}
}
