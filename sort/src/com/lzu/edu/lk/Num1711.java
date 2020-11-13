package com.lzu.edu.lk;

public class Num1711 {
	public static int findClosest(String[] words, String word1, String word2) {
		int lastindex1=-1;
		int lastindex2=-1;
		int Min_dis=Integer.MAX_VALUE;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word1)) {
				lastindex1=i;
			}
			if(words[i].equals(word2)) {
				lastindex2=i;
			}
			int tmp=Math.abs(lastindex1-lastindex2);
			if(lastindex1!=-1&&lastindex2!=-1&&Min_dis>tmp) {
				Min_dis=tmp;
			}
		}
		return Min_dis;
	}
	public static void main(String[] args) {
		String[] words = {"I","am","a","student","from","a","university","in","a","city"};
		String word1 = "a",word2 = "student";
		int tmp=findClosest(words, word1, word2);
	}
}
