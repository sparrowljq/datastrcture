package com.lzu.edu.lk;

/**
 * @author junqiangliu 
 * 	阶乘求末尾多少个零 统计5 25 125...的数量（只有5与某个数相乘产生0）
 */
public class jiecheng {
	public static int trailingZeroes(int n) {
		int count=0;
		while(n>=5) {
			n=n/5;
			count+=n;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(trailingZeroes(10));
	}
}
