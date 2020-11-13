package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 *	归并排序
 */
public class MergerSort {
	public static void main(String[] args) {
		int[] data=new int[11];
		for(int i=1;i<11;i++) {
			data[i]=10-i;
		}
		MergeSort(data);
	}
	public static void MergeSort(int[] data) {
		MSort(data,1, data.length-1);
	}
	public static void MSort(int[] SR,int s,int t){
		if(t<=s) {//待排序中仅有一个元素
			return;
		}else {
			int m=(s+t)/2;
			MSort(SR, s, m);
			MSort(SR, m+1, t);
			merge(SR, s, m, t);
		}
		
	}
	public static void merge(int[] SR,int i,int m,int n) {
		//将有序的SR[i...m]和SR[m+1...n]归并为有序的TR[i...n]
		int[] TR=new int[SR.length];
		int j=0,k=0,start=i;
		for(j=m+1,k=i;i<=m&&j<=n;++k) {//k用来将元素复制到TR[]中的位置
			if(SR[i]<SR[j]) {
				TR[k]=SR[i];
				i++;
			}else {
				TR[k]=SR[j];
				j++;
			}
		}
		//将剩余的元素复制进去(剩余的元素一定比之前的元素大)
		
		while(j<=n) {
			TR[k++]=SR[j++];
		}
		while(i<=m) {
			TR[k++]=SR[i++];
		}
		for(j=start;j<k;j++) {//将所有的元素复制到原数组中
			SR[j]=TR[j];
		}
	}
}
