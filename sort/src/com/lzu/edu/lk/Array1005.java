package com.lzu.edu.lk;

public class Array1005 {
	 public static int findString(String[] words, String s) {
		 int pos=-1;
		 int low=0;
		 int high=words.length-1;
		 while(low<=high) {
			 while(words[high].equals("")) {
				 high--;
			 }
			 while(words[low].equals("")) {
				 low++;
			 }
			 int mid=(low+high)/2;
			 while(words[mid].equals("")) {
				 mid--;
			 }
			 if(words[mid].equals(s)) {
				 pos=mid;
				 break;
			 }
			 else if(words[mid].compareTo(s)<0) {
//				 compareTo()两个字符串比较大小，是两个字符串的ASCII差值
				 low=mid+1;
			 }else {
				 high=mid-1;
			 }
		 }
		 return pos;
	 }
	 public static void main(String[] args) {
		 String[] words ={"DirNnILhARNS hOYIFB", "SM ", "YSPBaovrZBS", "evMMBOf", "mCrS", "oRJfjw gwuo", "xOpSEXvfI"};
		 int pos=findString(words, "mCrS");
		 System.out.println(pos);
	}
}
