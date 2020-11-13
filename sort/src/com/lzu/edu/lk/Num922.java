package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 奇偶排序
 */
public class Num922 {
	public static int[] sortArrayByParity(int[] A) {
		int i=0,j=1;
		while(i<A.length-1) {
			if(i%2==0&&A[i]%2!=0) {
				if(A[j]%2==0) {
					int tmp=A[j];
					A[j]=A[i];
					A[i]=tmp;
				}else {
					j=j+2;
				}
			}else {
				i=i+2;
			}
		}
		return A;
	}
	public static void main(String[] args) {
		int[] A= {4,2,5,7,9,8};
		int[] tmp = sortArrayByParity(A);
	}
}
