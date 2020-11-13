package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 双指针逆向合并
 */
public class Num1001_01 {
	public static void merge(int[] A, int m, int[] B, int n) {
		int i = m - 1, j = n - 1, k = A.length - 1;
		int cur;
		while (i >= 0 || j >= 0) {
			if(i==-1) {
				cur=B[j--];
			}else if(j==-1) {
				cur=A[i--];
			}else if(A[i]<B[j]) {
				cur=B[j--];
			}else {
				cur=A[i--];
			}
			A[k--]=cur;
		}
	}

	public static void main(String[] args) {
		int[] A = { 0 };
		int m = 0;
		int[] B = { 1 };
		int n = 1;
		merge(A, m, B, n);
	}
}
