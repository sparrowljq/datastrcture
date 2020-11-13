package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	字符串压缩
 */
public class ZipString {
	public static String compressString(String S) {
		int len=S.length();
		if(len>0) {
		String str="";
		char[] arr = S.toCharArray();
		char tmp=arr[0];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(tmp==arr[i]) {
				count++;
			}else {
				str+=tmp;
				str+=count;
				tmp=arr[i];
				count=1;
			}
		}
		str+=tmp;
		str+=count;
		if(str.length()<len) {
			return str;
		}else{
			return S;
		}
		}else {
			return S;
		}
		
    }
	public static void main(String[] args) {
		String str="aabcccccaaa";
		System.out.println(compressString(str));
	}
}
