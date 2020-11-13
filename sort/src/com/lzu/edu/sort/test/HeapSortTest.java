package com.lzu.edu.sort.test;
/**
 * 
 * @author junqiangliu
 *	堆排序
 */
public class HeapSortTest {
	public static void heapsort(int[] data,int n) {
		//构建大顶堆
		for(int i=n/2;i>0;i--) {
			adjust(data, i, n);
		}
		for(int i=n;i>1;i--) {
			swap(data, 1, i);
			adjust(data, 1, i-1);
		}
	}
	public static void swap(int[] data,int i,int j) {
		int tmp=data[i];
		data[i]=data[j];
		data[j]=tmp;
	}
	public static void adjust(int[] data,int s,int n) {
		int tmp=data[s];
		int i;
		for(i=s*2;i<n;i=i*2) {
			if(i<n&&data[i]<data[i+1]) {
				i++;
			}
			if(tmp>data[i]) {
				break;
			}
			data[i]=data[s];
			s=i;
		}
		data[s]=tmp;
	}
}
