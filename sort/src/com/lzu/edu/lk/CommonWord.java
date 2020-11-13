package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author junqiangliu
 *	两句话中的常见单词
 */
public class CommonWord {
	public static String[] uncommonFromSentences(String A, String B) {
        List<String> res=new ArrayList<>();
        Map<String, Integer> map=new HashMap<>();
        String[] arrA = A.split(" ");
        String[] arrB = B.split(" ");
        for(String item:arrA) {
        	map.put(item, map.getOrDefault(item, 0)+1);
        }
        for(String item:arrB) {
        	map.put(item, map.getOrDefault(item, 0)+1);
        }
        for(String c:map.keySet()) {
        	if(map.get(c)==1) {
        		res.add(c);
        	}
        }
        return res.toArray(new String[res.size()]);
    }
	public static void main(String[] args) {
		String A = "apple apple", B = "banana";
		String[] res = uncommonFromSentences(A, B);
	}
}
