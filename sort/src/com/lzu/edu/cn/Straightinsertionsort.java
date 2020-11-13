package com.lzu.edu.cn;

public class Straightinsertionsort {
	public static void main(String[] args) {
		//声明数据 第一个数据用来设置监视哨
		int[] data=new int[6];
		data[0]=0;
		data[1]=38;
		data[2]=49;
		data[3]=24;
		data[4]=32;
		data[5]=30;
		int[] res = insertSort(data);
		for(int k=1;k<res.length;k++) {
			System.out.println(res[k]);
		}
	}
	//插入排序的方法
	public static int[] insertSort(int[] data) {
		for(int i=2;i<data.length;i++) {
			if(data[i]<data[i-1]) {
				data[0]=data[i];
				data[i]=data[i-1];
				int j=0;
				//移动元素
				for(j=i-2;j>0;j--){
					if(data[j]>data[0]) {
						data[j+1]=data[j];
					}else {
						break;
					}
				}
				//在移动元素时多移动了一格
				data[j+1]=data[0];
			}
		}
		return data;
	}

}
