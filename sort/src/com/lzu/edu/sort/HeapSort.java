package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 *	堆排序
 */
public class HeapSort {
	//n表示从1开始元素的编号
	public static void heapSort(int[] data,int n) {
		//构建大顶堆
		int i;
		//从n/2向下取整开始调整
		for(i=n/2;i>0;i--) {
			heapAdjust(data,i,n);
		}
		//将堆顶元素(第一个元素)与数组的最后一个元素对调，并构造剩余元素的堆
		for(i=n;i>1;i--) {
			elemSwap(data,1,i);
			heapAdjust(data,1,i-1);//最小的元素与最大元素对调，从第一个元素调整
		}
	}
	public static void elemSwap(int[] data,int i,int j) {
		int tmp=data[i];
		data[i]=data[j];
		data[j]=tmp;
	}
	//其中s表示起始调整双亲节点的下标
	public static void heapAdjust(int[] data,int s,int n) {
		int i;
		int tmp=data[s];
		//调整双亲节点的以及子节点
		for(i=s*2;i<=n;i=i*2) {
			if(i<n&&data[i]<data[i+1]) {//当右节点的值大于左节点的值时将指针指向右节点
				i++;
			}
			if(tmp>data[i]) {
				break;
			}
			data[s]=data[i];
			s=i;
		}
		data[s]=tmp;
	}
	public static void main(String[] args) {
		int[] data=new int[11];
		for(int i=1;i<11;i++) {
			data[i]=11-i;
		}
		heapSort(data, 10);
	}
}
