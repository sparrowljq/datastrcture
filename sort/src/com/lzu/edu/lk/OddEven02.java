package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	奇偶排序
 */
public class OddEven02 {
	public static int[] sortArrayByParity(int[] A) {
		//用于存放偶数
		int[] res=new int[A.length];
		int n=0;
		int m=1;
		for(int i=0;i<A.length;i++) {
			 if(A[i]%2==0) {
				 res[n]=A[i];
				 n+=2;
			 }else {
				 res[m]=A[i];
				 m+=2;
			 }
		}
		return res; 
	}
	public static void main(String[] args) {
		int[] data={3,1,2,4};
		sortArrayByParity(data);
	}
}
