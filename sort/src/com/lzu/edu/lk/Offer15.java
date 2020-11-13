package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 统计二进制中的1的个数
 */
public class Offer15 {
	public int hammingWeight(int n) {
		int res=0;
		while(n!=0) {
			res+=n&1;
			n>>>=1;
		}
		return res;
	}
	public int hammingWeight1(int n) {
		int res=0;
		while(n!=0) {
			res+=1;
			n&=n-1;
		}
		return res;
	}
}
