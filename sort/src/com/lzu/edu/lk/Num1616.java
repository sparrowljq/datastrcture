package com.lzu.edu.lk;

public class Num1616 {
	//如果中间序列
	public static int[] subSort(int[] array) {
		if(array == null || array.length == 0) return new int[]{-1, -1};
		//右侧的最小值小于中间序列的最大值
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int last=-1,first=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
				max=Math.max(max, array[i]);
			}else {
				last=i;
			}
			if(array[array.length-i-1]<min) {
				min=Math.min(min, array[array.length-i-1]);
			}else {
				first=array.length-i-1;
			}
		}
		return new int[]{first,last};
	}
	public static void main(String[] args) {
		int[] array= {1,2,4,7,10,11,7,12,6,7,16,18,19};
		int[] tmp = subSort(array);
	}
}
