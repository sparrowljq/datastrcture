package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	双指针辅助空间合并
 */
public class Num1001 {
	public void merge(int[] A, int m, int[] B, int n) {
		int[] data=new int[A.length]; 
		int i,j,k=0;
		for(i=0,j=0;i<m&&j<n;k++) {
			if(A[i]<B[j]) {
				data[k]=A[i];
				i++;
			}else {
				data[k]=B[j];
				j++;
			}
		}
		while(i<m) {
			data[k++]=A[i];
			i++;
		}
		while(j<n) {
			data[k++]=B[j];
			j++;
		}
		for(i=0;i<A.length;i++) {
			A[i]=data[i];
		}
	}
}
