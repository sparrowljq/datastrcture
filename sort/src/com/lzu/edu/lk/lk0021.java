package com.lzu.edu.lk;


/**
 * 
 * @author junqiangliu
 *	完全平方数的第二种解法（二分法）
 *	说明：遇到的问题数据越界的问题
 */
public class lk0021 {
	 public static boolean isPerfectSquare(int num) {
		 boolean flag=false;
		 if(num==1) {
			 flag=true;
		 }
		 //二分法查找
		 int low=2,high=num;
		 while(high>=low) {
			 int mid=(low+high)/2;
			 if(mid*mid==num){
				 
				 flag=true;
				 break;
			 }
			 if(mid<num/mid){
				 low=mid+1;
			 }else {
				 high=mid-1;
			 }
		 }
		 return flag;
	 }
	 public static void main(String[] args) {
		System.out.println(isPerfectSquare(5));
	}
}
