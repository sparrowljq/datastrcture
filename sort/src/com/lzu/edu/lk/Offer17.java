package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 * 分治法解决（此方法不行）
 */
public class Offer17 {
	public int[] printNumbers(int n) {
		int len=(int) Math.pow(10, n);
		int[] res=new int[len-1];
		int count=1;
		while(count<len) {
			res[count-1]=count;
			count++;
		}
		return res;
	}
}
