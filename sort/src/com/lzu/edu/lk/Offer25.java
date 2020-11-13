package com.lzu.edu.lk;

public class Offer25 {
	 public String replaceSpace(String s) {
		 char[] arr = s.toCharArray();
		 String res="";
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==' ') {
				 res+="%20";
			 }else {
				 res+=arr[i]+"";
			 }
		 }
		 return res;
	 }
	 public String replaceSpace1(String s) {
		 char[] arr = s.toCharArray();
		 StringBuilder sb=new StringBuilder();
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==' ') {
				sb.append("%20");
			 }else {
				 sb.append(arr[i]);
			 }
		 }
		 return sb.toString();
	 }
}
