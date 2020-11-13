package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	url转化
 */
public class URL {
	public String replaceSpaces(String S, int length) {
		StringBuilder sb=new StringBuilder();
		char[] arr=S.toCharArray();
		for(int i=0;i<length;i++) {
			if(arr[i]==' ') {
				sb.append("%20");
			}else {
				sb.append(arr[i]);
			}
		}
		return sb.toString();
    }
	public String replaceSpaces1(String S, int length) {
		return S.substring(0,length).replaceAll(" ", "%20");
	}
}
