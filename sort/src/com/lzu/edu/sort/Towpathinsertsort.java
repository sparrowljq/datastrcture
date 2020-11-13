package com.lzu.edu.sort;

/**
 * 
 * @author junqiangliu 2-路插入排序
 */
public class Towpathinsertsort {
	public static void main(String[] args) {
		//原始数据
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
		int[] aux=new int[10];
		int[] res = insertSort(data, aux);
	}
	//2-路插入排序
	public static int[] insertSort(int[] data,int[] aux) {
		aux[0]=data[1];
		int pre=0,next=aux.length-1;
		for(int i=2;i<data.length;i++) {
			if(data[i]>aux[0]) {//比辅助空间的第一个元素大的放后面
				pre++;
				for(int j=pre-1;j>0;j--) {
					if(data[i]<aux[j]) {
						aux[j+1]=aux[j];
					}else {
						aux[j]=data[i];
						break;
					}
				}
			}else {
				next--;
				for(int j=next+1;j<data.length;j++) {
					if(data[i]>aux[j]) {
						aux[j-1]=aux[j];
					}else {
						aux[j]=data[i];
					}
				}
			}
		}
		return aux;
	}
}
