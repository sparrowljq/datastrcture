package com.lzu.edu.lk;

public class Offer58 {
	public static String reverseLeftWords(String s, int n) {
		int len=s.length();
		return s.substring(2,len)+s.substring(0,n);
		
	}
	public static void main(String[] args) {
		System.out.println(reverseLeftWords("abcdefg", 2));
	}
}
