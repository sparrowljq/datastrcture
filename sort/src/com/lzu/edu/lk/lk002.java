package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	有效的完全平方数
 */
public class lk002 {
	 public static boolean isPerfectSquare(int num) {
		 boolean flag=false;
		 if(num==1) {
			 flag=true;
		 }
		 for(int i=num/2;i>1;i--) {
			 if(i*i==num) {
				 flag=true;
				 break;
			 }
		 }
		 return flag;
	 }
	 public static void main(String[] args) {
		System.out.println(isPerfectSquare(10));
	}
}
