package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 求1+2+…+n
 */
public class Offer64 {
	int res=0;
	public int sumNums(int n) {
		boolean x= n>1&&sumNums(n-1)>0;
		res+=n;
		return res;
	}
	public static void main(String[] args) {
		System.out.println(3>>1);
	}
}
