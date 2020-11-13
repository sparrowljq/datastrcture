package com.lzu.edu.sort.test;

public class MergesortTest {
	public static void mergeSot(int[] data) {
		Msort(data, 0, data.length-1);
	}
	public static void Msort(int[] data,int s,int e) {
		if(s<=e) {
			return;
		}
		int m=(s+e)/2;
		Msort(data, s, m);
		Msort(data, m+1, e);
		Merge(data,s,m,e);
	}
	private static void Merge(int[] data, int s, int m, int e) {
		int[] tmp=new int[data.length];
		int k=0;
		int i,j;
		for(j=m+1,i=s;i<=m&&j<=e;k++) {
			if(data[i]<data[j]) {
				tmp[k]=data[i];
				i++;
			}else {
				tmp[k]=data[j];
				j++;
			}
		}
		while(i<=m) {
			tmp[k++]=data[i];
			i++;
		}
		while(j<=e) {
			tmp[k++]=data[j];
			j++;
		}
		for(int t=0;t<tmp.length;t++) {
			data[t]=tmp[t];
		}
	}
}
