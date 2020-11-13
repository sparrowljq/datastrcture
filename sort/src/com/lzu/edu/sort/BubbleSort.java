package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 *	冒泡排序
 */
public class BubbleSort {
	public static void bubbleSort(int[] data) {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length-i-1;j++) {
				if(data[j]>data[j+1]) {
					int tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		int[] data=new int[10];
		data[0]=0;
		data[1]=13;
		data[2]=5;
		data[3]=7;
		data[4]=9;
		data[5]=12;
		data[6]=8;
		data[7]=16;
		data[8]=4;
		data[9]=7;
		bubbleSort(data);
	}
}
