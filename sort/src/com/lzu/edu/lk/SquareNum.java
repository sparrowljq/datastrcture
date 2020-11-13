package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	平方数和a^2+b^2=c
 */
public class SquareNum {
    public static boolean judgeSquareSum(int c) {
    	boolean flag=false;
    	for(long a=0;a<=c;a++) {
    		double b = Math.sqrt(c-a*a);
    		if(b==(int)b) {
    			flag=true;
    		}
    	}
    	return flag;
    }
    //枚举a,用二分法寻找b
    public static boolean judgeSquareSum1(int c) {
    	boolean flag=false;
    	for(int a=0;a<=c;a++) {
    		int low=0,high;
    		high=c-a*a;
    		while(low<=high) {
    			int mid=(low+high)/2;
    			if(high==mid*mid){
    				return true;
    			}else if(high>mid*mid) {
    				low=mid+1;
    			}else {
    				high=mid-1;
    			}
    		}
    		
    	}
    	return flag;
    }
    public static void main(String[] args) {
		System.out.println(judgeSquareSum1(0));
	}
}
