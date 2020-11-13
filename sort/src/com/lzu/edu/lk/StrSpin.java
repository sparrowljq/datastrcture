package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	字符串轮转
 */
public class StrSpin {
	//"erbottlewat" + "erbottlewat" = erbottle waterbottle wat
	public static boolean isFlipedString(String s1, String s2) {
		boolean flag=false;
		if(s1.length()!=s2.length()) {
			return flag;
		}
		if((s2+s2).indexOf(s1)!=-1) {
			flag=true;
		}
		return flag;
    }
	public static void main(String[] args) {
		String s1="erbottlewat";
		String s2="waterbottle";
		boolean res=isFlipedString(s1, s2);
	}
}
