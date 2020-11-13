package com.lzu.edu.sort;
/**
 * 
 * @author junqiangliu
 *	希尔排序
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] data=new int[10];
		data[1]=13;
		data[2]=5;
		data[3]=7;
		data[4]=9;
		data[5]=12;
		data[6]=8;
		data[7]=16;
		data[8]=4;
		data[9]=7;
		int[] dlta=new int[5];
		dlta[0]=5;
		dlta[1]=3;
		dlta[2]=1;
		ShellSort(data, dlta, 3);
		for(int i=1;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void ShellInsert(int[] data,int dk) {
		for(int i=dk+1;i<data.length;i++) {
			if(data[i]<data[i-dk]) {//如果该元素小于i-dk位置的元素
				data[0]=data[i];
				int j=0;
				for(j=i-dk;j>0;j=j-dk) {
					data[j+dk]=data[j];//将各组元素后移
					if(data[j]<=data[0]) {
						break;
					}
				}
				data[j+dk]=data[0];
			}
		}
	}
	public static void ShellSort(int[] data,int dlta[],int t) {
		for(int k=0;k<t;k++) {
			ShellInsert(data, dlta[k]);
		}
	}
}
