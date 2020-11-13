package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu
 *	奇偶数排序
 */
public class OddEven {
	public static int[] sortArrayByParity(int[] A) {
		//用于存放偶数
		int[] res=new int[A.length];
		int m=0;
		int n=A.length;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0){
				res[m++]=A[i];
			}else {
				n--;
				res[n]=A[i];
			}
		}
		return res; 
	}
	public static void main(String[] args) {
		int[] data={3,1,2,4};
		sortArrayByParity(data);
	}
}
